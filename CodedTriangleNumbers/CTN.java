/*
Project Euler # 42

*/

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class CTN {
    public static void main( String[] args ) throws Exception {
      Scanner fileIn = new Scanner( new File("pe42.txt") ).useDelimiter(",");
      ArrayList<String> words = new ArrayList<>();
      int[] tnumbers = new int[100];
      int count = 0;

      while ( fileIn.hasNext() )
          words.add(fileIn.next());

      for ( int i=0; i<100; i++ )
          tnumbers[i] = (i*i + i)/2;

      for ( int i=0; i<words.size(); i++ ) {
          int total = 0;
          for ( int j=1; j<words.get(i).length()-1; j++ )
          // words.get(0) & words.get(-1) are quotation marks
              total += (words.get(i).charAt(j) - 64);
          if ( contains(tnumbers, total) )
              count++;
      }

      System.out.println(count);
    }

    public static boolean contains( int[] arr, int n ) {
        for ( int i : arr )
            if ( i == n )
                return true;
        return false;
    }
}
