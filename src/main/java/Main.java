import java.util.Arrays;

import static services.Converter.StringArrToIntArr;

public class Main {

    public static void main(String[] args) {

        int[] input = StringArrToIntArr(args);
        System.out.println("HELLO");
        Arrays.stream(input).forEach(System.out::println);
    }

}
