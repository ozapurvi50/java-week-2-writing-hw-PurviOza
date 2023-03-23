package homework_week_6;
/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Programme_7TempConversion {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit : ");
        float temp = scanner.nextFloat();

        //Object creation

        Programme_7TempConversion t = new Programme_7TempConversion();
        t.convertTempToDegreeCelsius(temp);
        //closing the scanner object
        scanner.close();

    }
        // Temperature conversion method

    public void convertTempToDegreeCelsius(float temp) {
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temperature " + temp + "fahrenheit is equal to " + c + "degree celsius");
    }
}
