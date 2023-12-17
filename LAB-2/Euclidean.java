import java.util.*;
import java.math.BigInteger;

public class Euclidean
{
    public static int getGcd(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd =b1.gcd(b2);

        return gcd.intValue();
    }

    public static int euclideanAlgo(int a, int b) {
        int r0 = a, r1 = b, s0 = 1, s1 = 0, t0 = 0, t1 = 1;
        int r, s, t, q;

        while(r1 > 0) {
            q = r0 / r1;

            r = r0 - (q * r1);
            r0 = r1;
            r1 = r;

            s = s0 - (q * s1);
            s0 = s1;
            s1 = s;

            t = t0 - (q * t1);
            t0 = t1;
            t1 = t;
        }

        t = t0;

        return t;
    }

    public static void main(String[] args) {
        System.out.print(euclideanAlgo(75, 21));
    }
}