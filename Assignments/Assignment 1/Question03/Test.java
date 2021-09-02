/*
3. Create a BMI (Body Mass Index) calculator that reads the
user’s weight in pounds and height in inches (or, if you prefer,
the user’s weight in kilograms and height in meters), then
calculates and displays the user’s body mass index.
The formula for calculating BMI is

            (WeightInKiloGrams)
BMI = ----------------------------
    (HeightInMeters * HeightInMeters);
BMI VALUES
Underweight if BMI is less than 18.5
Normal if BMI is in between 18.5 and 24.9
Overweight if BMI is in between 25 and 29.9
Obese if BMI is 30 or greater
*/

import java.util.*;
public class Test {

    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Weight in Kgs. :: ");
        double wt = myObj.nextDouble();
        System.out.print("Enter Height in Mtrs. :: ");
        double ht = myObj.nextDouble();
        double BMI = wt/(ht*ht);
        if(BMI<18.5)
            System.out.println("BMI :: Underweight");
        else if(BMI>18.5 && BMI<24.9)
            System.out.println("BMI :: Normal");
        else if(BMI>25 && BMI<29.9)
            System.out.println("BMI :: Overweight");
        else if(BMI>30)
            System.out.println("BMI :: Obese");
        else 
            System.out.println("BMI :: Data Invalid");
        myObj.close();
    }
    
}
