/*
Project Euler # 46

*/

import java.util.ArrayList;

public class GOC {
    public static void main( String[] args ) {
        ArrayList<Integer> odd_composites = new ArrayList<>();
        int[] squares = new int[100];

        for ( int i=0; i<squares.length; i++ )
            squares[i] = (i+1)*(i+1);

        for ( int i=9; i<10000; i += 2)
            if ( !is_prime(i) )
                odd_composites.add(i);

        for ( int i : odd_composites ) {
            int count = 0;
            for ( int j=2; j<i; j++ )
                if ( is_prime(j) && contains(squares, (i-j)/2) ) {
                    count++;
                    break;
                }
            if ( count == 0 ) {
                System.out.println(i);
                break;
            }
        }

    }

    public static boolean is_prime( int n ) {
        if ( n == 0  || n == 1 )
            return false;

        for ( int i = 2; i < n; i++ )
            if ( n != 2 && n % i == 0 )
                return false;

        return true;
    }

    public static boolean contains( int[] arr, int n ) {
        for ( int i : arr )
            if ( i == n )
                return true;
        return false;
    }
}
