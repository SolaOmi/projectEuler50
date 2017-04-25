/*
Project Euler # 13

Use BigInteger class in math module.
*/

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class LS
{
    public static void main(String[] args) throws Exception
    {
        Scanner fileIn = new Scanner( new File("pe13.txt") );
        String[] n = new String[100];
        BigInteger sum = BigInteger.ZERO;
        int count = 0;

        while ( fileIn.hasNext() )
        {
            n[count] = fileIn.next();
            count++;
        }

        for ( int i=0; i<n.length; i++ )
        {
            BigInteger bigInt = new BigInteger(n[i]);
            sum = sum.add(bigInt);
        }

        System.out.println(sum);
    }

}
