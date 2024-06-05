/*
Author: Jennifer Vo
Course: COP 2210
Date: 05/19/2024
Assignment: Using Math Methods
Instructor: Sergio Pisano
Description: Using math methods
*/
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {

	  Scanner scnr = new Scanner(System.in);
	  
      double calories;
      int age;
      double weight;
      double heartRate;
      double time;
      
      age = scnr.nextInt();
      weight = scnr.nextDouble();
      heartRate = scnr.nextDouble();
      time = scnr.nextDouble();
      
      calories = ((age * 0.2757) + (weight * 0.03295) + (heartRate * 1.0781) - 75.4991) * time / 8.368;
  
      System.out.printf("Calories: %.2f calories\n", calories);
   }
}

/* CODE OUTPUT
49 155 148 60
Calories: 736.21 calories

*/