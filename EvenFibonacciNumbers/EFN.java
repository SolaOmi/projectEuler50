/*
Project Euler # 2

Brute Force
*/

public class EFN {
    public static void main(String[] args) {
        int a = 1, b = 2, temp = 0, sum = 0;

        while ( b < 4000000 ) {
            temp = b;
            b += a;
            a = temp;
            if ( a % 2 == 0 ) sum += a;
        }
        System.out.println(sum);
    }
}
