/*
Project Euler

** Need to reduce run time, barely under 60s mark.
*/

public class TP {
    public static void main( String[] args ) {
        int count = 0, sum = 0, n = 11;

        while ( count != 11 ) {
            if ( is_prime(n) && is_trunctable(n) ) {
                sum += n;
                count++;
                n += 2;
            }
            else
                n += 2;
        }

        System.out.println(sum);
    }

    public static boolean is_prime( int n ) {
        if ( n == 0  || n == 1 )
            return false;

        for ( int i = 2; i < n; i++ )
            if ( n != 2 && n % i == 0 )
                return false;

        return true;
    }

    public static boolean is_trunctable( int n ) {
        if ( n < 10 )
            return false;

        String s = Integer.toString(n);
        String sublr, subrl;

        for ( int i=1; i<s.length(); i++ ) {
            sublr = s.substring(i);
            subrl = s.substring(0,s.length()-i);
            if ( !is_prime(Integer.parseInt(sublr)) )
                return false;
            if ( !is_prime(Integer.parseInt(subrl)) )
                return false;

        }

        return true;
    }

}
