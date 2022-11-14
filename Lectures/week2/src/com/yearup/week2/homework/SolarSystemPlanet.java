package com.yearup.week2.homework;
//Part 5: Create a SolarSystem Planet class in the same package which inherits from Planet class:
public class SolarSystemPlanet extends Planet {
    /*P5S1: Create a variable to store the star of the Solar system and set it to “SUN”. This value shouldn’t be
    modified by any other class.*/
    private String star = "SUN";
    //P5S2 Override the method to get Star from Planet class in SolarSystem class to return SUN.
    @Override
    public String starPlanet() {
        return this.star;
    }

    //P5S3: Create a method which accepts String as argument and returns planet’s position as integer return type.
    public int planetPos(String planet) {
        switch(planet) {
            case "Mercury":
            case "mercury":
                return 1;
            case "Venus":
            case "venus":
                return 2;
            case "Earth":
            case "earth":
                return 3;
            case "Mars":
            case "mars":
                return 4;
            case "Jupiter":
            case "jupiter":
                return 5;
            case "Saturn":
            case "saturn":
                return 6;
            case "Uranus":
            case "uranus":
                return 7;
            case "Neptune":
            case "neptune":
                return 8;
            default:
                System.out.println("Enter a valid planet");
                return 0;
        }
    }
}