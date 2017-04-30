/*
Project Euler # 18

Traverse the triangle from bottom up instead of top down.
*/

import java.io.File;
import java.util.Scanner;

public class MPSI {
    public static void main( String[] args ) throws Exception {
        Scanner fileIn = new Scanner( new File("pe18.txt") );
        int[][] n = new int[15][15];

        for ( int i=0; i<15; i++ )
            for ( int j=0; j<i+1; j++ )
                n[i][j] = fileIn.nextInt();
        fileIn.close();

        for ( int i=n.length-2; i>=0; i-- )
            for ( int j=0; j<i+1; j++ ) {
                if ( n[i+1][j] > n[i+1][j+1] )
                    n[i][j] += n[i+1][j];
                else
                    n[i][j] += n[i+1][j+1];
            }

        System.out.println(n[0][0]);
    }
}
