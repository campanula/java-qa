package tdd;

import org.junit.jupiter.api.Test;
import org.lbg.salesapp2.LineEntry;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineEntryTest {
    @Test
    public void onConstruction_verify_object_initialised_correctly() {
        // arrange
        String expectedResult = "hello";

        LineEntry cut = new LineEntry("hello");

        // act
        String actualResult = cut.getText();

        // assert
        assertEquals(expectedResult, actualResult);
    }
}