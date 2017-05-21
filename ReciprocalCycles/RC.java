/*
Project Euler # 26

*/

import java.math.BigInteger;

public class RC {
    public static void main( String[] args ) {
        boolean[] primes = sieve(1000);
        int max_reptend = 0, index = 0;

        for ( int i=0; i<primes.length; i++ )
            if ( primes[i] && repetend_length(i) > max_reptend ) {
                max_reptend = repetend_length(i);
                index = i;
            }

        System.out.println(index);
    }

    public static int repetend_length( int n ) {
        int[] remainders = new int[n];
        int value = 1, position = 0;

        while ( remainders[value] == 0 && value != 0 ) {
            remainders[value] = position;
            value *= 10;
            value %= n;
            position++;
        }

        return position - remainders[value];
    }

    public static boolean[] sieve( int n ) {
        boolean[] primes = new boolean[n+1];
        primes[0] = false;
        primes[1] = false;

        for( int i=2; i<primes.length; i++ )
            primes[i] = true;

        for( int i=2; i<=Math.sqrt(n)+1; i++ )
            if( primes[i] == true )
                for ( int j=i*i; j<=n; j+=i)
                    primes[j] = false;

        return primes;
    }
}
