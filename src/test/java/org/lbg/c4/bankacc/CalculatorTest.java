package org.lbg.c4.bankacc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {
    @Test
    public void onConstruction_verify_object_initialised_correctly() {
        // arrange
        double expectedResult = 34.75;
        Calculator cut = new Calculator(expectedResult);

        // act
        double actualResult = cut.getBalance();

        // assert
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void onAddition_Update_Balance() {
        // arrange
        double startAmount = 30;
        double expectedEndAmount = 40;
        double inputAmount = 10;
        Calculator cut = new Calculator(startAmount);

        // act
        cut.addition(inputAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertEquals(expectedEndAmount, actualEndAmount);
    }

    @Test
    public void onSubtraction_Update_Balance() {
        // arrange
        double startAmount = 30;
        double expectedEndAmount = 20;
        double inputAmount = 10;
        Calculator cut = new Calculator(startAmount);

        // act
        cut.subtraction(inputAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertEquals(expectedEndAmount, actualEndAmount);
    }

    @Test
    public void onMultiplication_Update_Balance() {
        // arrange
        double startAmount = 30;
        double expectedEndAmount = 300;
        double inputAmount = 10;
        Calculator cut = new Calculator(startAmount);

        // act
        cut.multiplication(inputAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertEquals(expectedEndAmount, actualEndAmount);
    }

    @Test
    public void onDivision_Update_Balance() {
        // arrange
        double startAmount = 300;
        double expectedEndAmount = 30;
        double inputAmount = 10;
        Calculator cut = new Calculator(startAmount);

        // act
        cut.division(inputAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertEquals(expectedEndAmount, actualEndAmount);
    }

    @Test
    public void onAddition_entry_invalid_less_than_zero() {
        // arrange
        double startAmount = 30;
        double expectedEndAmount = 30;
        double inputAmount = -1;
        Calculator cut = new Calculator(startAmount);

        // act
        cut.addition(inputAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertEquals(expectedEndAmount, actualEndAmount);
    }

    @Test
    public void onSubtraction_entry_invalid_less_than_zero() {
        // arrange
        double startAmount = 30;
        double expectedEndAmount = 30;
        double inputAmount = -1;
        Calculator cut = new Calculator(startAmount);

        // act
        cut.subtraction(inputAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertEquals(expectedEndAmount, actualEndAmount);
    }

    @Test
    public void onMultiplication_entry_invalid_less_than_zero() {
        // arrange
        double startAmount = 30;
        double expectedEndAmount = 30;
        double inputAmount = -1;
        Calculator cut = new Calculator(startAmount);

        // act
        cut.multiplication(inputAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertEquals(expectedEndAmount, actualEndAmount);
    }

    @Test
    public void onDivision_entry_invalid_less_than_zero() {
        // arrange
        double startAmount = 30;
        double expectedEndAmount = 30;
        double inputAmount = -1;
        Calculator cut = new Calculator(startAmount);

        // act
        cut.division(inputAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertEquals(expectedEndAmount, actualEndAmount);
    }

    @Test
    public void onSubtraction_result_invalid_less_than_zero() {
        // arrange
        double startAmount = 30;
        double expectedEndAmount = 30;
        double inputAmount = 30;
        Calculator cut = new Calculator(startAmount);

        // act
        cut.subtraction(inputAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertEquals(expectedEndAmount, actualEndAmount);
    }

    @Test
    public void onConstruction_is_not_null() {
        // arrange
        double placeholderResult = 0;
        Calculator cut = new Calculator(placeholderResult);

        // act
        double actualResult = cut.getBalance();

        // assert
        assertNotEquals(actualResult, null);
    }

    @Test
    public void onAddition_does_not_equal_null() {
        // arrange
        double startAmount = 0;
        double  inputAmount = 5;
        Calculator cut = new Calculator(startAmount);

        // act
        cut.addition(inputAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertNotEquals(null, actualEndAmount);
    }

    @Test
    public void onSubtractiondoes_not_equal_null() {
        // arrange
        double startAmount = 0;
        double  inputAmount = 5;
        Calculator cut = new Calculator(startAmount);

        // act
        cut.subtraction(inputAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertNotEquals(null, actualEndAmount);
    }

    @Test
    public void onMultiplication_does_not_equal_null() {
        // arrange
        double startAmount = 0;
        double  inputAmount = 5;
        Calculator cut = new Calculator(startAmount);

        // act
        cut.multiplication(inputAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertNotEquals(null, actualEndAmount);
    }

    @Test
    public void onDivision_does_not_equal_null() {
        // arrange
        double startAmount = 0;
        double  inputAmount = 5;
        Calculator cut = new Calculator(startAmount);

        // act
        cut.division(inputAmount);
        double actualEndAmount = cut.getBalance();

        // assert
        assertNotEquals(null, actualEndAmount);
    }

}
