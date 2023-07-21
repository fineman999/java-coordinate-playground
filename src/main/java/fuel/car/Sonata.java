package fuel.car;

public class Sonata extends Car {
    private final int distance;

    private final int PER_LITER = 10;

    private final String name = "Sonata";
    public Sonata(int distance) {
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
