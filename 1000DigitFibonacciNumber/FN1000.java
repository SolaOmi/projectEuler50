/*
Project Euler # 25

Brute Force
*/

import java.math.BigInteger;

public class FN1000 {
    public static void main(String[] args) {
        BigInteger temp = BigInteger.ZERO, prev = BigInteger.ONE,
                   cur = BigInteger.ONE;
        int index = 2, count = 0;

        while ( count < 1000 ) {
            temp = cur;
            cur = cur.add(prev);
            prev = temp;
            index += 1;
            count = String.valueOf(cur).length();
        }

        System.out.println(index);
    }

}
