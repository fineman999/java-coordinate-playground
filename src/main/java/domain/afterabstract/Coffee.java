package domain.afterabstract;

public class Coffee extends CaffeInBeverage{
    @Override
    void brew() {
        System.out.println("필터를 통해서 커피를 우려낸다.");
    }

    @Override
    public void addCondiments() {
        System.out.println("설탕과 우유를 추가한다.");
    }
}
