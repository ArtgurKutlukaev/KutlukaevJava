import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] a = {1,2,3, 4,5, 6,7, 8,9, 10,};

        for (int i = 0; i < a.length; i++) {
            a[i] = (i + 1) * 2;

            System.out.println(Arrays.toString(a));

        }
    }
}