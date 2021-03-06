/*
// Can find the divisibility function in the python file.

d_6 = 5 or 0, only way d_4d_5d_6 is divisible by 5.
can't be 0 because d_6d_7d_8 % 11 = 0 (011, 022 ... 099) is not pandigital
d_6 = 5

d_6d_7d_8 % 11 == 0
for i in range(500, 600):
    if i % 11 == 0:
        print(i)
d_6d_7d_8 = {506, 517, 528, 539, 561, 572, 583, 594}

divisibility('94', 13, 'back')
Using divisibility function and our knowledge of pandigital values we can
limit the possibilities for d_7d_8d_9
d_6d_7d_8d_9 = {5286, 5390, 5728, 5832}

divisibility('32',17, 'back')
same procedure for d_8d_9d_10
d_6d_7d_8d_9d_10 = {52867, 53901, 57289}

divisibility('57', 7, 'front')
same procedure for d_5d_6d_7, except we add the digit to the front.
d_5d_6d_7d_8_d_9d_10 = {952867, 357289}

d_4 has to be even or 0, because d_2d_3d_4 must be divisible by 2.
d_4d_5d_6d_7d_8_d_9d_10 = {0952867, 4952867, 0357289, 4357289, 6357289}

divisibility('63', 3, 'front')
d_3d_4d_5d_6d_7d_8_d_9d_10 = {30952867, 60357289, 06357289 }

left with d_1, d_2 = {1, 4}
*/

public class SSD {
    public static void main( String[] args ) {
        String[] x = {"14","41"};
        String[] y = {"30952867", "60357289", "06357289"};
        Long sum = 0L;

        for ( String i : x )
            for ( String j : y )
                sum += Long.parseLong(i+j);

        System.out.println(sum);
    }
}
