package tdd;

public class HighestNumberFinder {
    public int findHighestNumber(int[] input) {

        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("Array can't be empty");
        }

        int temp = 0;

        for (int i = 0; i < input.length; i++) {
            if (temp < input[i]){
                temp = input[i];
            }
        }
        return temp;
    }
}
