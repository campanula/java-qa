package org.lbg.salesapp2;

import org.junit.jupiter.api.Test;
import org.lbg.salesapp2.StoreController;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StoreControllerTest {

    @Test
    public void calculateTotalCost_will_return_one_number_totalling_array(){
        // arrange
        ArrayList<Integer> arrayList = new ArrayList<>();
        StoreController cut = new StoreController();
        double expectedResult = 3;
        arrayList.add(1);
        arrayList.add(2);

        // act
        double actualResult = cut.calculateTotalCost(arrayList);

        // assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void calculateVAT_will_return_the_total_of_two_numbers_as_a_decimal(){
        // arrange
        StoreController cut = new StoreController();
        double expectedResult = 0.02;
        double notExpectedResult = 2;

        // act
        double actualResult = cut.calculateVAT(1, 2);

        // assert
        assertEquals(expectedResult, actualResult);
        assertNotEquals(notExpectedResult, actualResult);

    }

    //(cost + vat) * size
    @Test
    public void calculateTotalWithVATAndQuantity_will_return_the_total(){
        // arrange
        ArrayList<Integer> arrayList = new ArrayList<>();
        StoreController cut = new StoreController();
        double expectedResult = 6;
        arrayList.add(1);
        arrayList.add(2);


        // act
        double actualResult = cut.calculateTotalWithVatAndQuantity(arrayList, 1, 2);

        // assert
        assertEquals(expectedResult, actualResult);

    }
}
