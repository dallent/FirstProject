package day1.examples;

/**
 * Created by ${Dallent} on 3/25/14.
 */
public class ExampleSwitchCase {

    public static void main(String[] args) {

        // Java 7 and above can use strings in the switch statement.

        int j = 2;

        switch (j) {

            case 0:
                System.out.println("Value is 0");
                break;

            case 1:
                System.out.println("Value is 1");
                break;

            case 2:
                System.out.println("Value is 2");
                break;

            case 3:
                System.out.println("Value is 3");
                break;

            case 4:
                System.out.println("Value is 4");
                break;

            default:
                System.out.println("No Value");
                break;

        }
    }
}
