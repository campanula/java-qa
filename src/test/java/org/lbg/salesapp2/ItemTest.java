package org.lbg.salesapp2;

import org.junit.jupiter.api.Test;
import org.lbg.salesapp2.Item;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {

    @Test
    public void onConstruction_verify_object_initialised_correctly() {
        // arrange
        double expectedResult = 2;
        ArrayList<Integer> arrayList = new ArrayList<>();

        Item cut = new Item(arrayList, 2, 5);

        // act
        double actualResult = cut.getTotalCost();

        // assert
        assertEquals(expectedResult, actualResult);
    }
}
