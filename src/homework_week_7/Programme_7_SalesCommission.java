package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program input seller id, sellers name, sales amount, and basic salary
 * then fined this sales
 * Commission
 * Sales amount &gt;= 50,000 35%
 * Sales amount &gt;= 30,000 20%
 * &gt;= 20,000 10%
 * &gt;= 10,000 5%
 * &lt; 10,000 2%
 *
 */

public class Programme_7_SalesCommission {
    public static void main(String[] args) {
        //Scanner declaration for reading input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Seller Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Seller ID: ");
        int sellerId = scanner.nextInt();
        System.out.println("Enter Sales Amount: ");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter Basic Salary:");
        int basicSalary = scanner.nextInt();
        //creating the object to call instance method
        Programme_7_SalesCommission salesCommission = new Programme_7_SalesCommission();
        int grossSalary = basicSalary+salesCommission.calculateCommission(salesAmount);
        System.out.println("Seller's name is    " + name);
        System.out.println("Seller's Id is    "+ sellerId);
        System.out.println("Seller's sales amount is : " + salesAmount);
        System.out.println("Seller's basic salary is:  " + basicSalary);
        System.out.println("Seller's gross salary is : " + grossSalary);
        //closing the scanner object
        scanner.close();



    }
    //calculating the sales commission 
    public int calculateCommission(int saleAmount){
        int commission;
        if (saleAmount>=50000){
            commission = (saleAmount*35)/100;
            System.out.println("Sales Commission is " + commission);
        } else if (saleAmount>=30000){
            commission= (saleAmount*20)/100;
            System.out.println("Sales Commission is " + commission);
        } else if(saleAmount<=20000){
            commission = saleAmount*10/100;
            System.out.println("Sales Commission is "+ commission);
        } else if(saleAmount>=10000){
            commission = saleAmount*5/100;
            System.out.println("Sales Commission is " + commission );
        } else{
            commission = (saleAmount*2)/100;
            System.out.println("Sales Commision is " + commission);
        }
        return commission;

    }
    
    
    
    
    
    
}
