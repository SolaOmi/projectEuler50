/*
Project Euler # 1

Using the boolean operator || (or) will capture the numbers that are
exclusively multiples of 3 and 5 in addition to numbers that are
multiples of both.
*/

public class M35
{
    public static void main(String[] args)
    {
        int sum = 0;

        for ( int i=0; i<1000; i++ )
            if ( i % 3 == 0 || i % 5 == 0 )
                sum += i;

        System.out.println(sum);
    }
}
