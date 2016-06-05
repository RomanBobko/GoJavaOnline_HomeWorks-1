package com.gojavaonline3.dlenchuk.module03.fs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmitrij Lenchuk on 01.06.2016.
 * Class Directory
 */
public class Directory extends File {

    private final List<File> files = new ArrayList<>();


    Directory(String name) {
        super(name);
        System.out.println("Directory '" + this.getName() + "' has been created");
    }

    public File file(String name) {
        int index = indexOf(name);
        return index >= 0 ? file(index) : null;
    }

    public int indexOf(String name) {
        for (int i = 0; i < files.size(); i++) {
            if (files.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public File file(int index) {
        return files.get(index);
    }

    public boolean add(File file) {
        if (files.add(file)) {
            System.out.println("Item '" + file.getName() + "' has been added to Directory '" + this.getName() + "'");
            return true;
        }
        return false;
    }

    public boolean delete(String name) {
        return delete(file(name));
    }

    public boolean delete(File file) {
        if (file == null) {
            return false;
        }
        if (files.remove(file)) {
            System.out.println("Item '" + file.getName() + "' has been deleted from Directory '" + this.getName() + "'");
            return true;
        }
        return false;
    }

    public void clear() {
        /*GC rescue us*/
        files.clear();
        System.out.println("Directory '" + this.getName() + "' has been cleared");
    }

    @Override
    public void open() {
        for (File file : files) {
            System.out.println(file);
        }
    }

    public void copy(File file) throws Exception {
        if (hasCircleChain(file)) {
            throw new Exception("Circle Chain Exception");
        }
        File newFile = file.clone();
        files.add(newFile);
    }

    private boolean hasCircleChain(File file) {
        if (this == file) {
            return true;
        }
        if (file instanceof Directory) {
            boolean result;
            for (int i = 0; i < ((Directory)file).fileCount(); i++) {
                result = hasCircleChain(((Directory) file).file(i));
                if (result) {
                    return true;
                }
            }
        }
        return false;
    }

    public int fileCount() {
        return files.size();
    }

    public void move(File file, Directory destination) {
        destination.add(file);
        this.delete(file);
    }

}
