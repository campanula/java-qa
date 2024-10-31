package tdd;

import org.junit.jupiter.api.Test;
import org.lbg.salesapp2.CustomPrompt;
import org.lbg.salesapp2.Item;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomPromptTest {

    @Test
    public void onConstruction_verify_object_initialised_correctly() {
        // arrange
        CustomPrompt cut = new CustomPrompt();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expectedResult = "hi";

        // act
        cut.prompt("hi");

        // assert
        assertEquals(expectedResult + System.lineSeparator(), outContent.toString());
    }
}
