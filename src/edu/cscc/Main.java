package edu.cscc;
import java.util.Scanner;

// Gaige Wycuff, 1/28/2019
public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("Please enter a temperature to be converted to Celcius(-1 to exit): ");
            float userTemp = input.nextFloat();

            if (userTemp < -460) {
                break;
            }

            float getTemp = getTemp(userTemp);
            float toCelcius = toCelcius(getTemp);
            displayTemp(toCelcius);


        }
    }

    public static float getTemp(float temp) {
        return temp;
    }

    public static float toCelcius(float a) {
        float b = ((a - 32) * 5) / 9;
        return b;

    }

    public static void displayTemp(float temp) {
        System.out.println("The temperature in Celcius is: " + temp);
    }
}
