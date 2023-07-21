package beverage.domain.before;

public class Coffee {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        System.out.println("설탕과 우유를 추가한다.");
    }

    private void pourInCup() {
        System.out.println("컵에 따른다.");
    }

    private void brewCoffeeGrinds() {
        System.out.println("필터를 통해서 커피를 우려낸다.");
    }

    private void boilWater() {
        System.out.println("물을 끓인다.");
    }

}
