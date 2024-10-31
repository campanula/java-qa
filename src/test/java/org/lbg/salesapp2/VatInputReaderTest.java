package org.lbg.salesapp2;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VatInputReaderTest {
    @Test
    public void getValidatedVatRate_will_return_string_entered_as_int(){
        // arrange
        ICustomPrompt icp = new CustomPrompt();
        VatInputReader cut = new VatInputReader(icp);
        int expectedResult = 5;

        String input = "5";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());

        // act
        int actualResult = cut.getValidatedVatRate(inputStream);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkIfInt_will_return_true_for_valid_postive_integer(){
        // arrange
        ICustomPrompt icp = new CustomPrompt();
        VatInputReader cut = new VatInputReader(icp);
        boolean expectedResult = true;

        String input = "5";

        // act
        boolean actualResult = cut.checkIfInt(input);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkIfInt_will_return_false_for_not_valid_non_integer(){
        // arrange
        ICustomPrompt icp = new CustomPrompt();
        VatInputReader cut = new VatInputReader(icp);
        boolean expectedResult = false;

        String input = "afaf";

        // act
        boolean actualResult = cut.checkIfInt(input);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkIfInt_will_return_false_for_not_valid_negative_integer(){
        // arrange
        ICustomPrompt icp = new CustomPrompt();
        VatInputReader cut = new VatInputReader(icp);
        boolean expectedResult = false;

        String input = "-5";

        // act
        boolean actualResult = cut.checkIfInt(input);

        // assert
        assertEquals(expectedResult, actualResult);
    }

}
