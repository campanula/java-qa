package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HighestNumberFinderTest {

    // singleItem array should return the single item
    @Test
    public void find_highest_in_array_of_one_expect_single_item() {
        // arrange
        HighestNumberFinder cut = new HighestNumberFinder();
        int[] input = {10};
        int expectedResult = 10;

        // act
        int actualResult = cut.findHighestNumber(input);

        //assert
        assertEquals(expectedResult, actualResult);
    }

    // findHighestNumber will return 13 from 13, 4
    @Test
    public void find_highest_in_array_of_two_descending_expect_first_element() {
        // arrange
        HighestNumberFinder cut = new HighestNumberFinder();
        int[] input = {13, 4};
        int expectedResult = 13;

        // act
        int actualResult = cut.findHighestNumber(input);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    // findHighestNumber will return 13 from 7, 13
    @Test
    public void find_highest_in_array_of_two_ascending_expect_second_element() {
        // arrange
        HighestNumberFinder cut = new HighestNumberFinder();
        int[] input = {7, 13};
        int expectedResult = 13;

        // act
        int actualResult = cut.findHighestNumber(input);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    // findHighestNumber will return 11 from 4, 5, -8, 3, 11, -21, 6
    @Test
    public void find_highest_in_array_of_seven_ascending_expect_fifth_element() {
        // arrange
        HighestNumberFinder cut = new HighestNumberFinder();
        int[] input = {4, 5, -8, 3, 11, -21, 6};
        int expectedResult = 11;

        // act
        int actualResult = cut.findHighestNumber(input);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    // findHighestNumber will return only one number from 4, 13, 13
    @Test
    public void find_highest_in_array_of_multiple_highest_elements_return_only_one() {
        // arrange
        HighestNumberFinder cut = new HighestNumberFinder();
        int[] input = {4, 13, 13};
        int expectedResult = 13;

        // act
        int actualResult = cut.findHighestNumber(input);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    // check if fhn throws on empty
    @Test
    public void findHighestNumber_empty_array_should_throw_exception() {
        // arrange
        HighestNumberFinder cut = new HighestNumberFinder();
        int[] emptyArray = {};

        // act
        // assert
        assertThrows(IllegalArgumentException.class, () ->  cut.findHighestNumber(emptyArray));
    }

    // findHighestNumber will return only one number from 4, 13, 13
    @Test
    public void find_highest_in_array_of_two_negative_numbers_return_second_element() {
        // arrange
        HighestNumberFinder cut = new HighestNumberFinder();
        int[] input = {-4, -3};
        int expectedResult = -3;

        // act
        int actualResult = cut.findHighestNumber(input);

        // assert
        assertEquals(expectedResult, actualResult);
    }
}
