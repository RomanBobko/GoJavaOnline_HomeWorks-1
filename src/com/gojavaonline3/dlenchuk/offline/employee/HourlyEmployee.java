package com.gojavaonline3.dlenchuk.offline.employee;

/**
 * Created by Dmitrij Lenchuk on 11.06.2016.
 */
public class HourlyEmployee extends Employee {

    public final byte COUNT_OF_HOURS_PER_DAY = 8;
    public final float COUNT_OF_DAY_PER_MONTH = 20.8f;

    private double hourlyRate;

    HourlyEmployee(int idCode, String name, double hourlyRate) {
        super(idCode, name);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double salary() {
        return COUNT_OF_DAY_PER_MONTH * COUNT_OF_HOURS_PER_DAY * hourlyRate;
    }
}
