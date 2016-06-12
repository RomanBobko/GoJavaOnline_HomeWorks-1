package com.gojavaonline3.dlenchuk.offline.employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmitrij Lenchuk on 12.06.2016.
 *
 */
public class DirectorRunner {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            if ((int) (Math.random()*2) == 1) {
                list.add(new HourlyEmployee((int)(Math.random()*1_000_000), "Hourly Employee " + i, (int)(Math.random()*500)));
            } else {
                list.add(new SalariedEmployee((int)(Math.random()*1_000_000), "Hourly Employee " + i, (int)(Math.random()*10_000)));
            }
        }
        StaffDepartment staffDepartment = StaffDepartment.getInstance();
        staffDepartment.setEmployees(list);
        AccountDepartment accountDepartment = AccountDepartment.getInstance();
        accountDepartment.setStaffDepartment(staffDepartment);
        System.out.println(String.format("%.2f", accountDepartment.calculate()));
    }
}
