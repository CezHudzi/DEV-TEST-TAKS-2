package services;

import java.util.ArrayList;

public class PairFinder {

    public ArrayList<String> findPairThatSumsTo13(int[] input) {
        Calculator calculator = new Calculator();
        ArrayList<String> result = new ArrayList<>();
        input = calculator.quickSort(input);

        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                int sum = input[i] + input[j];
                if (sum == 13) {
                    if (input[i] > input[j]) {
                        result.add(input[j] + " " + input[i]);
                    } else {
                        result.add(input[i] + " " + input[j]);
                    }
                } else if (sum > 13) {
                    break;
                }
            }
        }
        return result;
    }

}
