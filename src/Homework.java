import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;
public class Homework {
    public static void main(String[] args) {
        int[] array = new int[22];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(50000);
            System.out.println(Arrays.toString(array));
        }

        for (int p : array) {
            System.out.println(p * 3);
            if ((p * 3) > 20000) {
                out.println("Now");
            } else System.out.println("Yes");
        }
    }

}