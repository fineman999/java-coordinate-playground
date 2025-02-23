package domain.afterabstract;

import beverage.domain.afterabstract.CaffeInBeverage;
import beverage.domain.afterabstract.Coffee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CaffeInBeverageTest {

    @Test
    @DisplayName("커피(Coffee)는 카페인 음료(CaffeInBeverage)이다.")
    void upcasting() {
        CaffeInBeverage coffee = new Coffee();
    }

    @Test
    @DisplayName("카페인 음료(CaffeInBeverage)는 커피(Coffee)이다. - x")
    void downcasting() {
        CaffeInBeverage beverage = new Coffee();
        if (beverage instanceof Coffee) {
            Coffee coffee2 = (Coffee) beverage;
        }
    }
}