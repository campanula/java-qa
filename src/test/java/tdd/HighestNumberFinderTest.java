package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestNumberFinderTest {

    // singleItem array should return the single item
    @Test
    public void find_highest_in_array_of_one_expect_single_item(){
        // arrange
        HighestNumberFinder cut = new HighestNumberFinder();
        int[] input = {10};
        int expectedResult = 10;

        // act
        int actualResult = cut.findHighestNumber(input);

        //assert
        assertEquals(expectedResult, actualResult);
    }

    // findHighestNumber will return number

    // returnNumber will return number
}
