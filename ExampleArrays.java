package day1.examples;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ${Dallent} on 3/25/14.
 */
public class ExampleArrays {

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};

        System.out.println(a[2] + " " + a[4]);
       

        //enhanced for
        for(int temp : a) {
            System.out.println(temp);
        }

        System.out.println("--------");


        int[] x = new int[5];

            x[3] = 25;
            x[0] = 12;

            for (int temp2 : x) {
                System.out.println(temp2);
        }
    }
}
