/*
Project Euler # 40

StringBuffer to (int) conversion returns ASCII value for 0-9 (48-57)
*/

import java.lang.StringBuffer;

public class CC {
    public static void main( String[] args ) {
        StringBuffer s = new StringBuffer();
        int total = 1, lim = 1000000;

        for ( int i=0; i<lim; i++ )
            s.append(Integer.toString(i));

        for ( int i=0; i<=6; i++ )
            total *= (int)s.charAt((int)Math.pow(10,i)) - 48;

        System.out.println(total);
    }
}
