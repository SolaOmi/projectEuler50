/*
Project Euler # 6

Brute Force
*/

public class SSD {
    public static void main(String[] args) {
        int sum_of_squares = 0, square_of_sums = 0;

        for ( int i=1; i<=100; i++ ) {
            sum_of_squares += i*i;
            square_of_sums += i;
        }

        int n = square_of_sums;
        System.out.println(n*n - sum_of_squares);
    }

}
