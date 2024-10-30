package tdd;

public class HighestNumberFinder {
    public int findHighestNumber(int[] input) {

        int temp = 0;
        for (int i = 0; i < input.length; i++) {
            if (temp < input[i]){
                temp = input[i];
            }
        }
        return temp;
    }
}
