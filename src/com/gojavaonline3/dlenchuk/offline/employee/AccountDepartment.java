package com.gojavaonline3.dlenchuk.offline.employee;

import java.util.Iterator;

/**
 * Created by Dmitrij Lenchuk on 11.06.2016.
 *
 */
public class AccountDepartment {

    private static AccountDepartment instance = new AccountDepartment();

    private StaffDepartment staffDepartment;

    private AccountDepartment() {}

    public static AccountDepartment getInstance() {
        return instance;
    }

    public StaffDepartment getStaffDepartment() {
        return staffDepartment;
    }

    public void setStaffDepartment(StaffDepartment staffDepartment) {
        this.staffDepartment = staffDepartment;
    }

    public double calculate() {
        Iterator<Employee> iterator = staffDepartment.iterator();
        double result = 0;
        while (iterator.hasNext()) {
            result += iterator.next().salary();
        }
        return result;
    }
}
