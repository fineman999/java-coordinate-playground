package fuel;

import fuel.car.Car;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    public static final String SEPARATE = " : ";
    public static final String NEWLINE = "\n";
    public static final String LITER = "리터";
    private final List<Car> cars;

    private RentCompany() {
        cars = new ArrayList<>();
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        String report = "";
        report = getReports(report);
        return report;
    }

    private String getReports(String report) {
        StringBuilder reportBuilder = new StringBuilder(report);
        for (Car car : cars) {
            reportBuilder.append(car.getName()).append(SEPARATE).append(Math.round(car.getChargeQuantity())).append(LITER).append(NEWLINE);
        }
        report = reportBuilder.toString();
        return report;
    }
}
