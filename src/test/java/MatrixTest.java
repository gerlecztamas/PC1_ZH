import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MatrixTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MATRIX_LENGTH = 5;

    // TODO: Uncomment testcase to test countNumbersDivisibleBySeven method.

    @Test
    public void testCountNumbersDivisibleBySeven() {
        int[][] matrix = {
                { 84,  67,  22, -72,  95},
                { 72, -70,   2, -88,  30},
                { 95, -79, -87, -27, -97},
                {-52, -64, -13, -19, -27},
                { 79,  89,  95, -84, -53}
        };

        assertEquals(3, Matrix.countNumbersDivisibleBySeven(matrix));
    }


    // TODO: Uncomment testcase to test columnsWithMax method.

    @Test
    public void testColumnsWithMax() {
        int[][] matrix = {
                { 84,  67,  22, -72,  95},
                { 72, -70,   2, -88,  30},
                { 95, -79, -87, -27, -97},
                {-52, -64, -13, -19, -27},
                { 79,  89,  95, -84, -53}
        };

        ArrayList<Integer> actual = Matrix.columnsWithMax(matrix);

        assertEquals(3, actual.size());
        assertTrue(actual.contains(0));
        assertTrue(actual.contains(2));
        assertTrue(actual.contains(4));
    }

}
