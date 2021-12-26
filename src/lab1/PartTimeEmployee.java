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
public class PartTimeEmployee extends Employee{
    private double hourlyrate;
    private double hours;

    public PartTimeEmployee() {
        hourlyrate = 0;
        hours = 0;
    }

    public double getHourlyrate() {
        return hourlyrate;
    }

    public void setHourlyrate(double hourlyrate) {
        this.hourlyrate = hourlyrate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    @Override
    public double calcPayment() {
        return (hourlyrate * hours);
    }
}
