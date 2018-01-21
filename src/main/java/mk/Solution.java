package mk;

public class Solution {

    public int[] solution(int[] a, int k) {
        int al = a.length;

        for (int i = 0; i < k && al > 0; i++) {
            a = rotateArray(a);
        }

        return a;
    }

    public int[] rotateArray(int[] a) {

        int[] tab = new int[a.length];

        for (int i = 1; i < a.length; i++) {
            tab[i] = a[i - 1];
        }

        tab[0] = a[a.length - 1];
        return tab;
    }

}
