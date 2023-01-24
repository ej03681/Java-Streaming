/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastreaming;

import java.util.stream.DoubleStream;

/**
 *
 * @author EddyJ
 */
public class Ex07_01GradebCurve {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter number of students : ");
        int n = input.nextInt();
        double[] myGrade = new double[n];
        System.out.print("Enter " + n + " scores: ");
        for (int i = 0; i < n; i++) {
            myGrade[i] = input.nextDouble();
        }
        //find max
        double max = DoubleStream.of(myGrade).max().getAsDouble();
        
        
        for (int j = 0; j < n; j++) {
            if (myGrade[j] >= max - 10) {
                System.out.println("Student " + j + " score is " + myGrade[j] + " and grade is A");
            } else if (myGrade[j] >= max - 20) {
                System.out.println("Student " + j + " score is " + myGrade[j] + " and grade is B");
            } else if (myGrade[j] >= max - 30) {
                System.out.println("Student " + j + " score is " + myGrade[j] + " and grade is C");
            } else if (myGrade[j] >= max - 40) {
                System.out.println("Student " + j + " score is " + myGrade[j] + " and grade is D");
            } else {
                System.out.println("Student " + j + " score is " + myGrade[j] + " and grade is F");
            }
        }
    }
}
