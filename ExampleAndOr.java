package day1.examples;

/**
 * Created by ${Dallent} on 3/25/14.
 */
public class ExampleAndOr {

    public static void main(String[] args) {

        int x, y;

        x = 10;
        y = -10;

        // && for "and" || symbol for "or"
        if (x > 0 && y > 0) {
            System.out.println(" Both nums are +ve");

        } else if (x > 0 || y > 0) {
            System.out.println(" at least one num is +ve");

        } else {
            System.out.println(" Both nums are -ve");

        }
    }
}