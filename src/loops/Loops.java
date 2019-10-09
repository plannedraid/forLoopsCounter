/*
 * Dylan Moore
 * Oct 8 2019
 * user promted Counting program
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author dymoo6791
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("---------Counting Program--------\nplease enter your choice");
        System.out.println("1    count from 0 to 10 by 1");
        System.out.println("2    count from 100 to 0 by 10");
        System.out.println("3    count from 50 to 500 by 50");
        System.out.println("4    count from 6000 to 1000 by 1000");
        System.out.println("Please enter your choice:");

        int userChoice = in.nextInt();
        if (userChoice == 1) { //if user selects 1, program runs first loop
            for (int i = 0; i <= 10; i++) { //loop from 1 to 10 by 1
                System.out.println(i); //output loop
            }
        } else if (userChoice == 2) {
            for (int i = 100; i >= 0; i = i - 10) {//loop from 1 to 10 by 1
                System.out.println(i); 
            }
        } else if (userChoice == 3) {
            for (int i = 50; i <= 500; i = i + 50) {
                System.out.println(i);
            }
        } else if (userChoice == 4) {
            for (int i = 6000; i >= 0; i = i - 1000) {
                System.out.println(i);
            }
        } else {
            System.out.println("INVALID"); //if user selects invalid number display "INVALID"
        }
    }
}