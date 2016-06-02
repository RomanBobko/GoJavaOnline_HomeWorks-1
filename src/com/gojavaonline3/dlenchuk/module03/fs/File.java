package com.gojavaonline3.dlenchuk.module03.fs;

/**
 * Created by Dmitrij Lenchuk on 01.06.2016.
 * Abstract Class File
 */
public abstract class File implements Cloneable /*Дима, это для копирования файлов*/ {
    private String name;

    public File(String name) {
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

    public File getFile(String name) {
        return name == null || this.name.equals(name) ? this : null;
    }

    public File clone() throws CloneNotSupportedException {
        return (File) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        File file = (File) o;

        return name.equals(file.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }

}
