package com.gojavaonline3.dlenchuk.offline.employee;

/**
 * Created by Dmitrij Lenchuk on 11.06.2016.
 */
public abstract class Employee {

    final private int idCode;
    private String name;

    protected Employee(int idCode, String name) {
        this.idCode = idCode;
        this.name = name;
    }

    public int getIdCode() {
        return idCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double salary();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (idCode != employee.idCode) return false;
        return !(name != null ? !name.equals(employee.name) : employee.name != null);

    }

    @Override
    public int hashCode() {
        int result = idCode;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
