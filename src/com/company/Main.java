package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Prompt user to enter 6 grades and have a range of 0-100
        Scanner scanner = new Scanner(System.in);       //Scanner
        int grade, i;
        int marks[] = new int[6];
        float total = 0,avg;

        //changed code
        for (i = 0; i < 6; i++) {                   //loop for prompting user to enter grade
            System.out.print("Enter grade " + (i + 1) + ":");  //Enter 6 grades

            marks[i] = scanner.nextInt();
            grade = marks[i];
            /**check grades . If they are in 0-100 then okay
             * If not then prompt user again for entering new grades
             */
            if (grade > 0 && grade <= 100) {               //Check if they are in 0-100

            } else {
                System.out.println("The range should be in 0-100");
                System.out.print("Enter grade" + (i + 1) + ":");
                marks[i] = scanner.nextInt();
            }

            total = total + marks[i];                     //add all the grades in a variable to average it
        }
        //Display all 6 grades with letter grade also

        System.out.printf("The marks of the 1rst grade is %d%%%n", marks[0]);
        System.out.printf("The marks of the 2nd grade is %d%%%n", marks[1]);
        System.out.printf("The marks of the 3rd grade is %d%%%n", marks[2]);
        System.out.printf("The marks of the 4th grade is %d%%%n", marks[3]);
        System.out.printf("The marks of the 5th grade is %d%%%n", marks[4]);
        System.out.printf("The marks of the 6th grade is %d%%%n", marks[5]);


        //Display average grade of all 6 grades with letter grade
        avg = total / 6;
        System.out.printf("The average Grade is %.1f, which is : ", avg); //display average grade
        if (avg >= 90 && avg <= 100) {
            System.out.print("A+");
        } else if (avg >= 80 && avg <= 89) {
            System.out.print("A");
        } else if (avg >= 75 && avg <= 79) {
            System.out.print("B+");
        } else if (avg >= 70 && avg <= 74) {
            System.out.print("B");
        } else if (avg >= 65 && avg <= 69) {
            System.out.print("C+");
        } else if (avg >= 60 && avg <= 64) {
            System.out.print("C");
        } else if (avg >= 55 && avg <= 59) {
            System.out.print("D+");
        } else if (avg >= 50 && avg <= 54) {
            System.out.print("D");
        } else {
            System.out.print("E");
        }
    }


}

