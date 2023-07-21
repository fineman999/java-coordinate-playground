package domain.afterabstract;

public abstract class CaffeInBeverage {
    abstract void brew();
    abstract void addCondiments();

    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected void pourInCup() {
        System.out.println("컵에 따른다.");
    }

    protected void boilWater() {
        System.out.println("물을 끓인다.");
    }
}
