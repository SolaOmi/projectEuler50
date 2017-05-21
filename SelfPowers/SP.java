/*
Project Euler # 48

*/

import java.math.BigInteger;

public class SP {
    public static void main( String[] args ) {
        BigInteger sum = BigInteger.ZERO;

        for ( int i=1; i<=1000; i++ ) {
            BigInteger bigInt = new BigInteger(Integer.toString(i));
            bigInt = bigInt.pow(i);
            sum = sum.add(bigInt);
        }

        String s = sum.toString();
        System.out.println(s.substring(s.length()-10));
    }
}
