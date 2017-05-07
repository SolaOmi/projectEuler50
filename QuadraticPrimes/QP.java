/*
Project Euler # 27

Brute Force
*/

public class QP {
    public static void main( String[] args ) {
        int maxp = 0, i = 0, j = 0;

        for ( int a=-999; a<1000; a++)
            for ( int b=-1000; b<=1000; b++) {
                int n = 0;
                while ( is_prime(Math.abs((n*n) + a*n + b)) )
                    n++;

                if ( n > maxp ) {
                  maxp = n;
                  i = a;
                  j = b;
                }
            }

        System.out.println(maxp + ", " + i + ", " + j + ", " + i*j);
    }

    public static boolean is_prime( int n ) {
        if ( n == 0  || n == 1 )
            return false;
        if ( n == 2 )
            return true;
        for ( int i = 2; i <= Math.sqrt(n); i++ )
            if ( n % i == 0 )
                return false;

        return true;
    }
}
