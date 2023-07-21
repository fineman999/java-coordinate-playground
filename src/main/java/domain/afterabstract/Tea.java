package domain.afterabstract;

public class Tea extends CaffeInBeverage {

    @Override
    void brew() {
        System.out.println("티백을 담근다.");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가한다.");
    }
}
