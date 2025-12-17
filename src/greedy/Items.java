package greedy;

public class Items {
    int value, weight;

    public Items(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    double getRatio()
    {
        return (double) value /weight;
    }
}
