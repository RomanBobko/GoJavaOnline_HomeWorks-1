package com.gojavaonline3.dlenchuk.offline.employee;

/**
 * Created by Dmitrij Lenchuk on 11.06.2016.
 */
public class SalariedEmployee extends Employee {

    private double salary;

    public SalariedEmployee(int idCode, String name, double salary) {
        super(idCode, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double salary() {
        return salary;
    }
}
