package com.yearup.week2.homework;
import java.util.Scanner;

/*Part 3: Create a class which implements the Calculator under the above package which requests the user to
input length and calculates the area of a square and shows the output.
 */
public class SArea implements Calculator {

    /*S3P4: Set the correct access modifier for the variable to ensure that the variables
    declared in the class can’t be modified outside this class.*/
    private double squarearea;
    private double sidelength;

    private static double r;

    @Override
    public double getArea(double num1, double num2) {
        this.squarearea = num1*num2;
        return this.squarearea;
    }

    public void displayArea() {
        System.out.println( squarearea);
    }

    /*P3S2: The display message to get user input and assigning the scanner value to a variable should be
    done in a separate method.*/
    public void setLength() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a length: ");
        this.sidelength = scan.nextDouble();
    }

    @Override
    public double getSum(double num1, double num2) {
        return 0;
    }

    @Override
    public double getVolume(double num1, double num2, double num3) {
        return 0;
    }

    /*S3P5: Modify the calculate area method which was implemented from the interface to calculator area
     of a square using the formula r*r; The argument for this method is the local variable in step 4*/

    public double area2(double r){
        double area2 = r*r;
        return area2;
    }

    /*S3P6: The display message and the code to show the area of the square should be
     done in a separate method.*/
    public static double input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length: ");
        return input.nextDouble();
    }



    public static void main(String[] args) {
    /*P3S7: Create an object for this class in the main method and call the functions in orde
    to get user input, calculate area and display user output.*/
        SArea cArea = new SArea();

        //cArea.setLength();
        final double AREA = cArea.getArea(cArea.sidelength,cArea.sidelength);
        //cArea.displayArea();
        //P3S3: Create a local variable in the main method to store the return value from Step 2.
        r = input();
        System.out.println(cArea.area2(r));
    }
}