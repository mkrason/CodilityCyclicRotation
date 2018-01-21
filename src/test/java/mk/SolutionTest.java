package mk;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void checkArray1() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = solution.solution(a, 0);
        assertTrue(Arrays.equals(a, result));
    }

    @Test
    void checkArray2() {
        int[] a = {};
        int[] result = solution.solution(a, 5);
        assertTrue(Arrays.equals(a, result));
    }

    @Test
    void checkArray3() {
        int[] a = {};
        int[] result = solution.solution(a, 0);
        assertTrue(Arrays.equals(a, result));
    }

    @Test
    void checkArray4() {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6};
        int[] result = solution.solution(a, 3);
        assertTrue(Arrays.equals(b, result));
    }

}