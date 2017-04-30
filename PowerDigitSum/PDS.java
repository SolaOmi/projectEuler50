/*
Project Euler # 16

Brute Force
*/

import java.math.BigInteger;

public class PDS {
    public static void main( String[] args ) {
    BigInteger num = BigInteger.ONE;
    int sum = 0;

    for ( int i=1; i<=1000; i++ ) {
        BigInteger bigInt = new BigInteger("2");
        num = num.multiply(bigInt);
    }

    String number = num.toString();
    for ( int i=0; i<number.length(); i++ )
        sum += Character.getNumericValue(number.charAt(i));

    System.out.println(sum);

  }
}
