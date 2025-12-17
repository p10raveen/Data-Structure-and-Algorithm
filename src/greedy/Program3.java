package greedy;

public class Program3 {
    public static void main(String[] args) {
        Items[] items= {
            new Items(60,10),
            new Items(100,20),
            new Items(120,30)
        };
        int capacity = 50;

        double maxValue = getMaxValue(items,capacity);
        System.out.println("Max Value is "+maxValue);
    }

    private static double getMaxValue(Items[] items, int capacity) {

       // 1. sort
        for(int i=0;i<items.length-1;i++)
        {
            for(int j=i+1;j<items.length;j++)
            {
                if(items[i].getRatio() < items[j].getRatio())
                {
                    Items temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }

        // 2. Greedy approach
        double totalValue = 0.0;
        for(Items item : items)
        {
            if(capacity==0)
            {
                break;
            }
            if(item.weight <= capacity)
            {
                totalValue = totalValue + item.value;
                capacity = capacity-item.weight;
            }
            else
            {
                totalValue = totalValue + item.getRatio()*capacity;
                break;
            }
        }
        return totalValue;
    }
}
