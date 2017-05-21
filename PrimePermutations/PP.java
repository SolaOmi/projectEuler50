/*
Project Euler # 49

*/

import java.util.Arrays;

public class PP {
    public static void main( String[] args ) {
        boolean[] primes = sieve(10000);

        for ( int i=999; i<10000; i++ )
            if ( primes[i] == true ) {
                int[] digits1 = digitArray(i);
                for ( int j=999; j<10000; j++ )
                    if ( primes[j] == true && j > i  ) {
                        int[] digits2 = digitArray(j);
                        if ( Arrays.equals(digits1, digits2) ) {
                            int k = j + (j - i);
                            int[] digits3 = digitArray(k);
                            if ( k < primes.length && primes[k] == true && Arrays.equals(digits1, digits3) )
                                System.out.println(i + ", " + j + ", " + k);
                        }
                    }

            }

    }

    public static int[] digitArray( int n ) {
        int len = Integer.toString(n).length();
        int[] digits = new int[len];

        for ( int i=0; i<digits.length; i++ ) {
            digits[i] = n % 10;
            n /= 10;
        }
        Arrays.sort(digits);

        return digits;

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
