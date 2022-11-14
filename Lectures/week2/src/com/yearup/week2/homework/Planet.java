//P4S1: Create a class Planet under the same package.
package com.yearup.week2.homework;
//P4S2: This class should implement the same interface created in part 1.
public class Planet implements Calculator {

    //P4S3: Create the following member variables:
    //P4S3a: Variable to store the star of the planet. This should be accessible by the subclass but not any other class
    protected String star;
    //P4S4a: Variable to capture planet name of type String
    private String planetName;
    //P4S4b: Variable to capture planet radius of type double
    private double planetRadius;
    //P4S3b: Implement a method to access Star from subclasses with String return type
    public String starPlanet() {
        return this.star;
    }

    @Override
    public double getArea(double num1, double num2) {
        return 0;
    }
    /*P4S5: Modify the calculate area method implemented from interface to use the following formula and
    return the area;Area = 3.14*radius*radius;*/
    public double getArea(double num1) {
        return 3.14 * num1 * num1;
    }

    @Override
    public double getSum(double num1, double num2) {
        return 0;
    }

    @Override
    public double getVolume(double num1, double num2, double num3) {
        return 0;
    }
}