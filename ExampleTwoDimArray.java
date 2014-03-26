package day1.examples;

/**
 * Created by ${Dallent} on 3/26/14.
 */
public class ExampleTwoDimArray {

    public static void main(String[] args) {

        int[][] TwoDim = new int[4][3];

        //Data could be assigned individually as follows: TwoDim[2][1] = 10 which would assign the value 10 to
        //to position 2,1.

        int temp = 10;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; i < 3; j++) {

                TwoDim[i][j] = temp;

                temp += 10;  }
        }

            }
        }


