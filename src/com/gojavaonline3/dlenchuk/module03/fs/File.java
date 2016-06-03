package com.gojavaonline3.dlenchuk.module03.fs;

/**
 * Created by Dmitrij Lenchuk on 01.06.2016.
 * Abstract Class File
 */
public abstract class File implements Cloneable {
    private String name;

    File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Renaming '" + this.name + "' to '" + name + "'...");
        this.name = name;
    }

    public abstract void open();

    public abstract void open(int level);

    public File clone() throws CloneNotSupportedException {
        return (File) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof File)) return false;

        File file = (File) o;

        if (name != null ? !name.equals(file.name) : file.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return name;
    }

}
