package greedy;

public class Program2 {
    public static void main(String[] args) {

        Activity[] activities = {
                new Activity(1,3),
                new Activity(2,5),
                new Activity(3,9),
                new Activity(6,8),
                new Activity(8,10)
        };

        selectActitivies(activities);
    }

    private static void selectActitivies(Activity[] activities) {
        //1. Sort
        for(int i=0;i<activities.length-1;i++)
        {
            for(int j=i+1;j<activities.length;j++)
            {
                if(activities[i].end > activities[j].end)
                {
                    Activity temp = activities[i];
                    activities[i] = activities[j];
                    activities[j] = temp;
                }
            }
        }

        // 2. Greedy Approach
        int lastEndTime = 0;
        for(Activity activity :activities)
        {
            if(activity.start >= lastEndTime)
            {
                System.out.println("("+activity.start+","+activity.end+")");
                lastEndTime = activity.end;
            }
        }
    }
}
