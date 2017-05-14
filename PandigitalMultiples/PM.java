/*
Project Euler # 38

*/

import java.util.Arrays;

public class PM {
    public static void main( String[] args ) {
        String ordered = "123456789";

        for ( int i=9123; i<=9876; i++ ) {
            String a = Integer.toString(i) + Integer.toString(2*i);
            char[] arr = a.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if ( ordered.equals(sorted) )
                System.out.println(a);
        }

    }
}
