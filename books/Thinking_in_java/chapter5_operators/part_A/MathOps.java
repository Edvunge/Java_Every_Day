package books.Thinking_in_java.chapter5_operators.part_A;

import java.util.Random;

public class MathOps {
    public static void main(String[] args) {
        // create a seeded random number generator:
        Random rand = new Random(47);
        int i, j, k;

        // choose value from 1 to 100:
        j = rand.nextInt(100) + 1;
        System.out.println("j : " + j);

        k = rand.nextInt(100) + 1;
        System.out.println("k : " + k);

        i = j + k;
        System.out.println("j + k : " + i);
        i = j - k;
        System.out.println("j - k : " + i);
        i = k / j;
        System.out.println("k / j : " + i);
        i = j * k;
        System.out.println("j * k : " + i);
        i = k % j;
        System.out.println("k % j : " + i);
        j %= k;
        System.out.println("j %= k : " + j);

        // Floating-point number tests:
        float u, v, w; // Applies to doubles, too
        v = rand.nextFloat();
        System.out.println("v : " + v);
        w = rand.nextFloat();
        System.out.println("w : " + w);
        u = v + w;
        System.out.println("v + w : " + u);
        u = v - w;
        System.out.println("v - w : " + u);
        u = v * w;
        System.out.println("v * w : " + u);
        u = v / w;
        System.out.println("v / w : " + u);

        // The following also works for char,
        // byte, short, int, long, and double:
        u = v += w;
        System.out.println("v += w : " + u);
        u = v -= w;
        System.out.println("v -= w : " + u);
        u = v *= w;
        System.out.println("v *= w : " + u);
        u = v /= w;
        System.out.println("v /= w : " + u);
    }
}
