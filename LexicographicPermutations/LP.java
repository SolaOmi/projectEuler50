/*
Project Euler # 24

   Lexographic Permutation Algorithm
   
1. Find the largest index k such that a[k] < a[k + 1]. If no such
   index exists, the permutation is the last permutation.
2. Find the largest index l greater than k such that a[k] < a[l].
3. Swap the value of a[k] with that of a[l].
4. Reverse the sequence from a[k + 1] up to and including the final
   element a[n].
   *Algorithm can be found in Permutation wikipedia.
*/

public class LP {
    public static void main( String[] args ) {
      int[] n = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
      int num = 1;

      while ( num < 1000000 ) {
          permutation(n);
          num++;
      }

      for ( int i = 0; i<n.length; i++ )
          System.out.print(n[i] + " ");
    }

    public static void swap( int[] a, int i, int j ) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] permutation( int[] a ) {
        int k = 0, l = 0;

        // 1
        for ( int i=0; i<a.length-1; i++ )
            for ( int j=i+1; j<=a.length-1; j++ )
                if ( a[j] > a[i] )
                    k = i;

        // 2
        for ( int i=k+1; i<a.length; i++ )
            if ( a[i] > a[k] )
                l = i;

        // 3
        swap(a,k,l);

        // 4
        int x = k+1, y = a.length-1;
        while ( x < y ) {
            swap(a,x,y);
            x++;
            y--;
        }

        return a;
    }
}
