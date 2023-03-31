package homework_week_7;

import java.util.Scanner;

public class Programme_2_LeapYear {
    /*
     *Write a java program to input any year like (ex.2007) and find out if it is leap year or
     * not?
     */
    // checking if its leap year
    public void isItLeapYear(int year){
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println("The year " + year + " Is a leap year");
        return;
        }
        System.out.println("The year " + year + " is not a leap year ");
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year ");
        int year = scanner.nextInt();
        Programme_2_LeapYear obj = new Programme_2_LeapYear();
        obj.isItLeapYear(year);
        scanner.close();
    }
}
