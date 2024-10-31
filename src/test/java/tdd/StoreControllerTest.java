package tdd;

import org.junit.jupiter.api.Test;
import org.lbg.salesapp2.StoreController;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
