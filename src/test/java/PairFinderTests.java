import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.PairFinder;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PairFinderTests {

    @Test
    public void findPairThatSumsTo13Test_correctInput_correctOutput() {
        PairFinder pairFinder = new PairFinder();

        int[] input1 = {1, 2, 10, 7, 5, 3, 6, 6, 13, 0};
        String correctResponse1 = "0 13\n" + "3 10\n" + "6 7\n" + "6 7";

        int[] input2 = {1, 12, 2, 11, 3 ,10, 4, 9, 5, 8, 6, 7};
        String correctResponse2 = "1 12\n" + "2 11\n" + "3 10\n" + "4 9\n" + "5 8\n" + "6 7";

        int[] input3 = {};
        String correctResponse3 = "";

        int[] input4 = {1, 20, 2, 5, 6, 30};
        String correctResponse4 = "";

        ArrayList<String>  output1 = pairFinder.findPairThatSumsTo13(input1);
        ArrayList<String>  output2 = pairFinder.findPairThatSumsTo13(input2);
        ArrayList<String>  output3 = pairFinder.findPairThatSumsTo13(input3);
        ArrayList<String>  output4 = pairFinder.findPairThatSumsTo13(input4);

        assertEquals(4, output1.size());
        assertTrue(output1.contains("0 13"));
        assertTrue(output1.contains("6 7"));
        assertTrue(output1.contains("3 10"));

        assertEquals(6, output2.size());
        assertTrue(output2.contains("1 12"));
        assertTrue(output2.contains("2 11"));
        assertTrue(output2.contains("3 10"));
        assertTrue(output2.contains("4 9"));
        assertTrue(output2.contains("5 8"));
        assertTrue(output2.contains("6 7"));

        assertEquals(0, output3.size());

        assertEquals(0, output4.size());

    }
}
