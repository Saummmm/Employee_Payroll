/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author saum
 */
public class Payroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Queue<Employee> empList = new LinkedList<>();
        boolean repeat = true;
        String ans;
        String name;
        String address;
        String phoneNum;
        while (repeat) {
            //asks user
            System.out.println("Would you like to add employees: Y/N");
            ans = myScanner.nextLine();
            //cancels loop if there is no request, it gets cancelled
            if (ans.equalsIgnoreCase("N")) {
                repeat = false;
            }
            else {
                System.out.println("Enter Name: ");
                name = myScanner.nextLine();
                System.out.println("Enter Address: ");
                address = myScanner.nextLine();
                System.out.println("Enter Phone Number: ");
                phoneNum = myScanner.nextLine();
                //requests common info first then analyzes the 
                System.out.println("Which employee would you like to add: Part-Time, Full-Time, or Manager?");
                ans = myScanner.next();
                if (ans.equalsIgnoreCase("Part-Time")) {
                    PartTimeEmployee x = new PartTimeEmployee();
                    x.setEmpName(name);
                    x.setAddress(address);
                    x.setPhoneNum(phoneNum);
                    System.out.print("Enter Hourly Rate: ");
                    x.setHourlyrate(myScanner.nextDouble());
                    System.out.print("Enter Number of Hours: ");
                    x.setHours(myScanner.nextDouble());
                    empList.add(x);
                } else if (ans.equalsIgnoreCase("Full-Time")) {
                    FullTimeEmployee x = new FullTimeEmployee();
                    x.setEmpName(name);
                    x.setAddress(address);
                    x.setPhoneNum(phoneNum);
                    System.out.print("Enter Monthly Salary: ");
                    x.setMonthlySalary(myScanner.nextDouble());
                    System.out.print("Enter Tax Rate: ");
                    x.setTaxRate(myScanner.nextDouble());
                    empList.add(x);
                } else if (ans.equalsIgnoreCase("Manager")){
                    Manager x = new Manager();
                    x.setEmpName(name);
                    x.setAddress(address);
                    x.setPhoneNum(phoneNum);
                    System.out.print("Enter Monthly Salary: ");
                    x.setMonthlySalary(myScanner.nextDouble());
                    System.out.print("Enter Tax Rate: ");
                    x.setTaxRate(myScanner.nextDouble());
                    System.out.print("Enter Bonus: ");
                    x.setBonus(myScanner.nextDouble());
                    empList.add(x);
                } else {
                    System.out.println("Try Again");
                }
            }
            System.out.println("Press any key to continue");
            myScanner.nextLine();
            System.out.println("Storing...\n");
        }
        //while loop analyzes queue for next elements
        while(!empList.isEmpty()) {
            System.out.println(empList.remove().toString());
            System.out.println("_________________________________________________\n");
        }
        
    }
    
}
