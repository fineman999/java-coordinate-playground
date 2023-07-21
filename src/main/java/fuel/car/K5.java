package fuel.car;

public class K5 extends Car {

    private final int distance;

    private final int PER_LITER = 13;

    private final String name = "K5";

    public K5(int distance) {
        this.distance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return PER_LITER;
    }

    @Override
    public double getTripDistance() {
        return distance;
    }

    @Override
    public String getName() {
        return name;
    }
}
