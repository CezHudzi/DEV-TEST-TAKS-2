import services.PairFinder;

import java.util.ArrayList;

import static services.Converter.StringArrToIntArr;

public class Main {

    public static void main(String[] args) {

        PairFinder pairFinder = new PairFinder();

        int[] input = StringArrToIntArr(args);

        ArrayList<String> result = pairFinder.findPairThatSumsTo13(input);
        result.forEach(System.out::println);
    }

}
