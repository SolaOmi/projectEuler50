/*
Project Euler # 45

All hexagonal numbers are a subset of triangle numbers
*/

public class TPH {
    public static void main( String[] args ) {
        Long n = 144L;

        while ( !is_pentagonal(hexagonal(n)) )
            n++;

        System.out.println(n + ", " + hexagonal(n));
    }

    public static Long hexagonal( Long n ) {
        return n * (2*n - 1);
    }

    public static boolean is_pentagonal( Long n ) {
        double x = (Math.sqrt(24*n + 1) + 1)/6;

        if ( x == (int)x )
            return true;
        else
            return false;
    }
}
