import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.PairFinder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PairFinderTests {

    @Test
    public void findPairThatSumsTo13Test_correctInput_correctOutput() {
        PairFinder pairFinder = new PairFinder();

        int[] input = {1, 2, 10, 7, 5, 3, 6, 6, 13, 0};
        String correctResponse = "0 13\n" + "3 10\n" + "6 7\n" + "6 7";

        assertTrue(pairFinder.findPairThatSumsTo13(input).contains("0 13"));
        assertTrue(pairFinder.findPairThatSumsTo13(input).contains("6 7"));
        assertTrue(pairFinder.findPairThatSumsTo13(input).contains("3 10"));

    }
}
