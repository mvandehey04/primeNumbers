/*
* Purpose: collect range of numbers and display prime numbers
* Author: Madeline Vande Hey
* Date: 4/26/22
*/
import java.util.Scanner;

public class Tester{
    public static void main(String args[]){
        // start scanner
        Scanner scan = new Scanner(System.in);

        // prompt for range and collect input
        System.out.println("Enter a range of numbers. EX: 100-500");
        String range = scan.nextLine();
        scan.close();

        // check for prime numbers
        Prime prime = new Prime(range);
        prime.getPrime();

    }
}