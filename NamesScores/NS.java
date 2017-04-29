/*
Project Euler # 22

*/

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class NS {
    public static void main( String[] args ) throws Exception {
        Scanner fileIn = new Scanner( new File("pe22.txt") );
        String[] names = fileIn.nextLine().split(",");
        int total = 0;

        Arrays.sort(names);
        for ( int i=0; i<names.length; i++ )
            for ( int j=0; j<names[i].length(); j++ )
            {
                if ( names[i].charAt(j) == '"')
                    continue;
                else
                    total += (i+1) * (names[i].charAt(j) - 64);
            }

        System.out.println(total);

    }
}
