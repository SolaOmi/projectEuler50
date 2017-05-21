/*
Project Euler # 44

*/

public class PN {
    public static void main( String[] args ) {
        int n = 2;
        boolean flag = true;

        while ( flag ) {
            n++;
            int pk = pentagonal(n);

            for ( int i=n-1; i>0; i-- ) {
                int pj = pentagonal(i);
                if ( is_pentagonal(pk-pj) && is_pentagonal(pk+pj) ) {
                    System.out.println(pk-pj);
                    flag = false;
                    break;
                }
            }
        }
    }

    public static int pentagonal( int n ) {
        return (int) n * (3*n - 1)/2;
    }

    public static boolean is_pentagonal( int n ) {
        double x = (Math.sqrt(24*n + 1) + 1)/6;

        if ( x == (int)x )
            return true;
        else
            return false;
    }
}
