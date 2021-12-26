/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author saum
 */
public class FullTimeEmployee extends Employee {
    private double monthlySalary;
    private double taxRate;
    
    public FullTimeEmployee() {
        monthlySalary = 0;
        taxRate = 0;
    }
    
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
    
    @Override
    public double calcPayment() {
        return (monthlySalary - (monthlySalary*taxRate));
    }
}
