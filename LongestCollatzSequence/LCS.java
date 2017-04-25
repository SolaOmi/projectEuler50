/*
Project Euler # 14


*/
import java.util.HashMap;

public class LCS
{
    public static void main(String[] args)
    {
        long max_key = 0;
        long max_value = 0;
        HashMap<Long, Long> collatz = new HashMap<>();
        collatz.put(1L,1L);
        collatz.put(2L,2L);
        collatz.put(3L,8L);

        for ( long i=4; i < 1000000; i++ )
        {
            long n = i;
            long count = 0;

            while ( n != 1 )
            {
                if ( collatz.containsKey(n) )
                {
                    count += collatz.get(n);
                    break;
                }
                else if ( n % 2 == 0 )
                {
                    n = n/2;
                    count++;
                }
                else
                {
                    n = 3*n + 1;
                    count++;
                }
            }

            collatz.put(i, count);
            if ( collatz.get(i) > max_value )
            {
                max_value = collatz.get(i);
                max_key = i;
            }
        }

        System.out.println(max_key + ", " + max_value);
    }
}
