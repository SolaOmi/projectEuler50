/*
Project Euler # 11

Java max can only compare two numbers.
*/

import java.io.File;
import java.util.Scanner;

public class LPG
{
    public static void main(String[] args) throws Exception
    {
        Scanner fileIn = new Scanner( new File("pe11.txt") );
        int[][] n = new int[20][20];
        int max = 1;

        for ( int i=0; i<20; i++ )
            for ( int j=0; j<20; j++ )
                n[i][j] = fileIn.nextInt();
        fileIn.close();

        for ( int i=0; i<20; i++ )
        {
            for ( int j=0; j<17; j++ ) // left/right
            {
                int c = n[i][j]*n[i][j+1]*n[i][j+2]*n[i][j+3];
                if ( c > max )
                    max = c;
            }

            for ( int j=0; j<20; j++ )  // up/down
                if ( i < 17 )
                {
                    int c = n[i][j]*n[i+1][j]*n[i+2][j]*n[i+3][j];
                    if ( c > max )
                        max = c;
                }

            for ( int j=3; j<17; j++ )  // diagonals
                if ( i > 2 && i < 17 )
                {
                    int nw = n[i][j]*n[i-1][j-1]*n[i-2][j-2]*n[i-3][j-3];
                    int ne = n[i][j]*n[i-1][j+1]*n[i-2][j+2]*n[i-3][j+3];
                    int sw = n[i][j]*n[i+1][j-1]*n[i+2][j-2]*n[i+3][j-3];
                    int se = n[i][j]*n[i+1][j+1]*n[i+2][j+2]*n[i+3][j+3];
                    int di = Math.max(se,Math.max(sw,Math.max(nw,ne)));
                    if ( di > max )
                      max = di;
                }
        }
        System.out.println(max);

    }
}
