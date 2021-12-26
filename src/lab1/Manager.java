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
public class Manager extends Employee{
    private double monthlySalary;
    private double taxRate;
    private double bonus;
    
    public Manager() {
        monthlySalary = 0;
        taxRate = 0;
        bonus = 0;
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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
     
    @Override
    public double calcPayment() {
        return (monthlySalary - (monthlySalary*taxRate) + bonus);
    }
}
