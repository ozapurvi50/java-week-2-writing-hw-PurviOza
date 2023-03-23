package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Programme_17_DecimalToBinary {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Java program to convert decimal to binary numbers ");
        System.out.print("Please enter decimal number : "); //number 5
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
        //closing the scanner object
        scanner.close();
    }

    //converting the decimal to binary

    public static void convertDecimalToBinary(int number) {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is: " + binary);
    }
}
