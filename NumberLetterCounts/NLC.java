/*
Project Euler # 17

Create string for the ones (0-9)
""    ""     ""    "" teens (10-19)
""    ""     ""    "" tens (20,30,40...90)
""    ""     ""    "" hundred & and
Figure out frequency of each String and add.
*/

public class NLC {
    public static void main( String[] args ) {
        String ones = "onetwothreefourfivesixseveneightnine";
        String teens = "tenelventwelvethirteenfourteenfifteensixteen"
                        + "seventeeneighteennineteen";
        String tens = "twentythirtyfourtyfiftysixtyseventyeightyninety";
        String hundred = "hundred";
        String and = "and";
        int count =  11; // 11 for one-thousand

        count += 900*hundred.length() + 100*ones.length()
                 + 891*and.length() + 100*tens.length() + 80*ones.length()
                 + 10*(ones.length() + teens.length());

        System.out.println(count);
    }
}
