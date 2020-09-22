/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map103lab1;

/*
 * @author kranthipyreddy
 */
import java.util.Scanner;

public class MAP103Lab1 {

    public static void main(String args[]) {
// Create a Scanner to obtain information from the command prompt
        Scanner input = new Scanner(System.in);
// Declare variables to hold information
        float celsius;
        float Fahrenheit;

//Prompt the user to enter the temperature in Celcius
        System.out.print("Please enter the temperature in celcius: ");
        celsius = input.nextInt();

//Convert Celsius to Fahrenheit
        Fahrenheit = celsius * (9f / 5) + 32;

        //Print the out      
        System.out.println(celsius + " degree Celsius is equals to " + Fahrenheit + " degree Fahrenheit.");
        input.close();
    }
}
