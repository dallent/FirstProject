package day1.examples;

/**
 * Created by ${Dallent} on 3/23/14.
 */
public class ExampleWhile {

    public static void main(String[] args) {

        int x = -10;

        while (x <= 0) {

            System.out.println("x = " + x);

            // Other ways to do incrementation are: x = x + 1, or x += 1.
            x++;
        }
    }
}
