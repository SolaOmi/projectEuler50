/*
Project Euler # 8

*/

import java.io.File;
import java.util.Scanner;

public class LPS
{
    public static void main(String[] args) throws Exception
    {
        Scanner fileIn = new Scanner( new File("pe8.txt") );
        int[] n = new int[1000];
        long temp, max = 0L;

        for ( int i=0; i<20; i++)
        {
            String line = fileIn.next();
            for ( int j=0; j<50; j++ )
            {
                n[j+(i*50)] = Character.getNumericValue(line.charAt(j));
            }
        }

        int x = 0;
        while ( x < 988 )
        {
            temp = 1L;
            for ( int i=x; i<x+13; i++ )
                temp *= n[i];
            if ( temp > max )
                max = temp;
            x++;
        }
        System.out.println(max);
    }

}
