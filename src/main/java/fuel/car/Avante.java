package fuel.car;

public class Avante implements Car {
    private final int distance;

    private final int PER_LITER = 15;

    private final String name = "Avante";

    public Avante(int distance) {
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
