package homework_week_7;

import java.util.Scanner;

public class Programme_3_Marksheet {
    /*/**
     * Write a java program to input student Name, roll No, and three subjects Math, Science and
     * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
     * Input, Marks should between 0 to 100”) and find out total, percentage and result.
     * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
     * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
     * _______________________________
     * | |
     * | Mark Sheet |
     * |_______________________________|
     * | Name : Jay |
     * | Roll No: 08 |
     * |_______________________________|
     * | Subjects : Marks |
     * |_______________________________|
     * | Math : 98 |
     * | Science : 90 |
     * | English : 85 |
     * |_______________________________|
     * | Total : 273 |
     * |_______________________________|
     * | Percentage : 91.0 |
     * | Result : Pass |
     * | Grade : A+ |
     * |_______________________________|
     */

    public static void main(String[] args) {
        //scanenr declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Student Name   \t\t:\t");
        String name = scanner.nextLine();
        System.out.println("Enter Student Roll Number \t\t:\t");
        int rollNum = scanner.nextInt();
        System.out.println("Enter Marks of Subject Maths \t:\t");
        int mathsMark = scanner.nextInt();
        if (mathsMark < 0 || mathsMark > 100) {
            System.out.println("\nInvalid input , Marks should be between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            mathsMark = scanner.nextInt();
        }
        System.out.println("Enter Marks of subject Science\t:\t ");
        int scienceMarks = scanner.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("\nInvalid input, Marks should be between 0 to 100 ");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            scienceMarks = scanner.nextInt();
        }
        System.out.println("Enter Marks of subject English \t:\t");
        int englishMarks = scanner.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("\n Invalid input, Marks should be between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            englishMarks = scanner.nextInt();
        }
        int total = sum(mathsMark, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMark, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathsMark, scienceMarks, englishMarks, total, percentage, result, grade);
        //closing the scanner object
        scanner.close();

    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //calculating the results on subject marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";

        }
    }

    //calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            } else {
                grade = "-";
            }
        }
        return grade;

    }

    // Printing the Marks sheet
    public static void printTheMarkSheet(String name, int rollNumber, int mathMarks, int scienceMarks, int englishMarks, double total, double percentage, String result, String grade) {
        System.out.println("--------------------------------");
        System.out.println("|                              |");
        System.out.println("| Mark Sheet                   |");
        System.out.println("|______________________________|");
        System.out.println("| Name: " + name + "           |");
        System.out.println("| Roll No:" + rollNumber + "   | ");
        System.out.println("|______________________________|");
        System.out.println("| Subject: Marks               |");
        System.out.println("|______________________________|");
        System.out.println("| Maths:" + mathMarks + "      |");
        System.out.println("| Science:" + scienceMarks + " |");
        System.out.println("| English:" + englishMarks + " |");
        System.out.println("|______________________________|");
        System.out.println("| Total:" + total + "          |");
        System.out.println("|______________________________|");
        System.out.println("| Percentage:" + percentage + "| ");
        System.out.println("|Result: " + result + "        |");
        System.out.println("|Grade:" + grade + "           |");
        System.out.println("|______________________________|");

    }


}