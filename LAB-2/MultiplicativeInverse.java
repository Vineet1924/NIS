package util;

import java.util.*;
import java.math.BigInteger;

public class MultiplicativeInverse {
    public static int getGcd(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd =b1.gcd(b2);

        return gcd.intValue();
    }
    public static int multiplicativeInverse(int n, int a) {
        int gcd = getGcd(a, n);
        int multiplicativeInverse;

        if(gcd == 1) {
            int r0 = n, r1 = a, t0 = 0, t1 = 1;
            int r, t, q, ans;

            while(r1 > 0) {
                q = r0 / r1;

                r = r0 - (q * r1);
                r0 = r1;
                r1 = r;

                t = t0 - (q * t1);
                t0 = t1;
                t1 = t;
            }

            t = t0;
            ans = r0;

            while(t <= 0) {
                t += 26;
            }

            return t;
        } else {
            System.out.println("Number's are not co-prime");
            return -1;
        }
    }
}