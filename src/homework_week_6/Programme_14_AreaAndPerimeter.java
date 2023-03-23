package homework_week_6;

/**
 * *Write a Java program to print the area and perimeter of a rectangle.
 *  *Test Data:
 *  *Width = 5.5 Height = 8.5
 *  *Expected Output:
 *  *Area is 5.6 * 8.5 = 47.60
 *  *Perimeter is 2 * (5.6 + 8.5) = 28.20
 *  */
 import java.util.Scanner;
public class Programme_14_AreaAndPerimeter {

    //Calculating area and perimeter of rectangle

    public static void areaAndPerimeterOFRectangle(int height, int width){
        int perimeter = 2 *(height + width);
        int area = (height * width);
        System.out.println("The area of the rectangle is :" + area);

    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle : ");
        int width =scanner.nextInt();
        System.out.print("Enter the height of the rectangle");
        int height = scanner.nextInt();
        areaAndPerimeterOFRectangle(height, width);


        //closing the scanner object
        scanner.close();


    }
}
