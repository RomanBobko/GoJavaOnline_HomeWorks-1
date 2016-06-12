package com.gojavaonline3.dlenchuk.offline.employee;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Dmitrij Lenchuk on 11.06.2016.
 */
public class StaffDepartment {
    private static final StaffDepartment instance = new StaffDepartment();

    public static StaffDepartment getInstance() {
        return instance;
    }

    private StaffDepartment() {
    }

    private List<Employee> employees;

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public boolean add(Employee employee) {
        return employees.add(employee);
    }

    public boolean remove(Employee employee) {
        return employees.remove(employee);
    }

    public Employee remove(int index) {
        return employees.remove(index);
    }

    public Iterator<Employee> iterator() {
        return employees.iterator();
    }

}
