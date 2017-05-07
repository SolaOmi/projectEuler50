/*
Project Euler # 32

Brute Force
*/

import java.util.HashSet;
import java.util.Set;

public class PP {
    public static void main( String[] args ) {
        Set<Integer> set = new HashSet<Integer>();
        String a, b, c;
        int total = 0;

        for ( int i=1; i<=100; i++ )
            for ( int j=i; j<= 10000/i; j++ ) {
                a = Integer.toString(i);
                b = Integer.toString(j);
                c = Integer.toString(i*j);
                if ( is_pandigital(a+b+c) )
                    set.add(i*j);
            }

        for ( int value : set )
            total += value;

        System.out.println(total);
    }

    public static boolean is_pandigital( String n ) {
        for ( int i=1; i<=9; i++ )
            if ( !n.contains(Integer.toString(i)) )
                return false;

        return true;
    }
}
