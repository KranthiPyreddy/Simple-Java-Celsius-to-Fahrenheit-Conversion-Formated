/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map103lab1;

/**
 *
 * @author kranthipyreddy
 */
import java.util.Scanner;

public class MAP103Lab1 {

    public static void main(String args[]) {
// Create a Scanner to obtain information from the command prompt
        Scanner input = new Scanner(System.in);
// Create variables to hold information
        int number1 = 0;
        int number2 = 0;
        int result = 0;
        
        System.out.print("Please enter the first number: ");
        number1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        number2 = input.nextInt();
        result = number1 + number2;
        System.out.printf("The sum of the two numbers is: %d", result);
        input.close();
    }
}
