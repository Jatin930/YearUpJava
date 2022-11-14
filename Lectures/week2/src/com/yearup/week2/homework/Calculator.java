package com.yearup.week2.homework;
//Part 2: Create a Calculator interface within the above package which has the following methods:

public interface Calculator {

    //P2S1: Method to calculate area which accepts two arguments of type double returns double
    double getArea(double num1, double num2);

    //P2S2: Method to calculate sum which accepts two arguments of type double returns double
    double getSum(double num1, double num2);

    //P2S3: Method to calculate volume which accepts three arguments of type double and returns double
    double getVolume(double num1, double num2, double num3);
}