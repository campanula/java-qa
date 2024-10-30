package org.lbg.c4.bankacc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {

    private Item item1;
    private Item item2;
    private Item item3;

    @BeforeEach
    public void createItemsForBasket() {

        item1 = new Item("Bananas", 6, 0.19);
        item2 = new Item("Avocado", 3, 0.89);
        item3 = new Item("Pizza", 200, 2);

    }

    @Test
    void verify_total_cost_in_basket() {
        // arrange
        Basket cut = new Basket();
        cut.addItem(item1);
        cut.addItem(item2);
        cut.addItem(item3);

        double expectedTotal = 403.81;

        // assert
        double actualTotal = cut.getTotal();

        // act
        assertEquals(expectedTotal, actualTotal, 2);
    }

    @Test
    public void onConstruction_verify_object_initialised_correctly() {
        // arrange
        Basket old = new Basket();
        old.addItem(item1);
        old.addItem(item2);
        old.addItem(item3);

        double expectedResult = 403.81;
        Basket cut = new Basket(old);

        // act
        double actualResult = cut.getTotal();

        // assert
        assertEquals(actualResult, expectedResult, 2);
    }
}
