package domain.after;

public class Coffee extends CaffeInBeverage {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        System.out.println("설탕과 우유를 추가한다.");
    }

    private void brewCoffeeGrinds() {
        System.out.println("필터를 통해서 커피를 우려낸다.");
    }
}
