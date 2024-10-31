package org.lbg.salesapp2;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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

    @Test
    public void getInput_will_return_entered_input() {
        // arrange
        InputStream inContent = new ByteArrayInputStream("1".getBytes());
        CustomPrompt icp = new CustomPrompt();
        VatInputReader cut = new VatInputReader(icp);
        String expectedResult = "1";

        // act
        String result = cut.getInput(inContent);

        // assert
        assertEquals(expectedResult, result);
    }

}
