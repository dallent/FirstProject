package day1.examples;

/**
 * Created by ${Dallent} on 3/24/14.
 */
public class ExampleDoWhile {

    /** A Do While loop will execute the "do" portion of the loop regardless of whether the condition of the while
     * is ever met.  A while loop will make sure the conditions are all met before printing or executing the rest
     * of the program.
     *
     */

    public static void main(String[] args) {

        int x = 10;

        do {
            System.out.println("x = " + x);

            x--;

        } while (x > 0);


    }
}
