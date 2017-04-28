/*
Project Euler # 20

*/

import java.math.BigInteger;

public class FDS {
    public static void main( String[] args )
    {
        String number;
        int sum = 0;

        number = factorial(100).toString();
        for ( int i=0; i<number.length(); i++ )
            sum += Character.getNumericValue(number.charAt(i));

        System.out.println(sum);
    }

    public static BigInteger factorial(int n)
    {
        BigInteger sum = BigInteger.ONE;
        for ( int i=1; i<=n; i++ )
            sum = sum.multiply(new BigInteger(i + ""));

        return sum;
    }
}
