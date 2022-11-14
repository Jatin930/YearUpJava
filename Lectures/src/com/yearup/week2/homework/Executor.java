//P1S1: Create a package/namespace called com.yearup.week2.homework
package com.yearup.week2.homework;
import java.util.Scanner;
//Part 6:
//P6S1: Create a class named Executor in the same package. This class should have the main method
public class Executor {
    //P6S3: Create a scanner object in the class so that it can be accessed by other methods
    //in the class.
    static Scanner scan = new Scanner(System.in);
    /*S6P4: Create an SolarSystemPlanet object (not under main method but under class itslef)
    and set the access modifier so that the object can be accessed by other member methods in the class.*/
    static SolarSystemPlanet ssp = new SolarSystemPlanet();

    public static void main(String[] args) {

        String planetName = planetName();
        double radius = planetRadius();
        double planetArea = ssp.getArea(radius);
        displayArea(planetArea);
        starPlanet(ssp);
        planetPos(ssp, planetName);
        System.out.println("Thanks for using our planet application. Goodbye!");
    }

    /*P6S5: Create a method which displays the message “Enter the planet name” and
    returns the input value from the user as String type.*/
    public static String planetName() {
        System.out.println("Enter the planet name: ");
        String input = scan.nextLine();
        return input;
    }

    /*P6S7: Create a method which displays the message “Enter the planet radius” and
    returns the input value from the user as double type.*/
    public static double planetRadius() {
        System.out.println("Enter the planet radius: ");
        double input = scan.nextDouble();
        scan.nextLine();
        return input;
    }

    /*P6S9: Create a function which accepts the local variable area and displays the area of
    the planet with a message “Area of the planet is”. This method does not return anything.*/
    public static void displayArea(double area) {
        System.out.println("Area of the planet is: " + area);
    }

    public static void starPlanet(SolarSystemPlanet p) {
        System.out.println("The star of the planet is: " + p.starPlanet());
    }

    public static void planetPos(SolarSystemPlanet p, String planetName) {
        int position = ssp.planetPos(planetName);
        System.out.println("The position of the planet is: " + position);
    }
}