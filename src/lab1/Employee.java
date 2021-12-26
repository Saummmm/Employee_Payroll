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
abstract public class Employee {
    private String empName;
    private String address;
    private String phoneNum;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    
    abstract public double calcPayment();
    
    @Override
    public String toString() {
        return("Employee Name: " + getEmpName() + "\nPayment: $" + Double.toString(calcPayment()));
    }
}
