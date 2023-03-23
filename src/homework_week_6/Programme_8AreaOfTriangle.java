package homework_week_6;
/**
 * Write a program to calculate the area of a triangle.
 */

import java.util.Scanner;

public class Programme_8AreaOfTriangle {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the lenght of the triangle : ");
        int lenght = scanner.nextInt();
        System.out.println("Please enter the height of the triangle : ");
        int height = scanner.nextInt();
        areaOfTriangle(height,lenght);
        scanner.close();
        //closing the scanner object
    }

    //Calculating the area of triangle with no return type with parameter method
    public static void areaOfTriangle(int lenght, int height) {
        int area = (lenght * height) / 2;
        System.out.println("The Area of a  triangle is : "+ area);
    }




}
