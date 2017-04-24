/*
Project Euler # 2

Using a while loop will run the Fibonacci sequence on the prev and
cur variables unitl cur is greater than 4,000,000. Check evenness using
modulo 2 test.
*/

public class EFN
{
    public static void main(String[] args)
    {
        int prev = 1, cur = 2, temp = 0, sum = 0;

        while ( cur < 4000000 )
        {
            temp = cur;
            cur += prev;
            prev = temp;
            if ( prev % 2 == 0 )
                sum += prev;
        }
        System.out.println(sum);
    }

}
