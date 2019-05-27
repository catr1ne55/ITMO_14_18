/**
 * Created by vladimir on 20.05.17.
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 50; ++i) {
            System.out.println(i);
        }
        int t = 0;
        t += 1;
        while (t*t < 1000) {
            int f = foo(t++, (t * 2 - 3) % 10);
            System.out.println(--f);
        }
        if (!(t > - (25 + 1))) {
            t = 2;
        }
        System.out.println(t);
        System.out.println(hcf_recursive(559, 65246));
        System.out.println(hcf_recursive(6533, 5426534));
        System.out.println(hcf_recursive(74565725, 9245));
        System.out.println(hcf(559, 65246));
        System.out.println(hcf(6533, 5426534));
        System.out.println(hcf(74565725, 9245));
    }

    private static int foo(int q, int r) {
        return (q > r ? q + r : q * (--r));
    }

    private static int hcf_recursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return hcf_recursive(b, a % b);
    }

    private static int hcf(int c, int d) {
        while (d != 0) {
            c %= d;
            c += d;
            d = c - d;
            c -= d;
        }
        return c;
    }
}
