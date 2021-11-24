package models;

import base.Salary;

public class Seller implements Salary {

    String name;
    double hours;
    double hourlyWage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double salaryCalculation(double salary, double hours) {
        return salary * hours;
    }
}
