package com.gojavaonline3.dlenchuk.module03.fs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Dmitrij Lenchuk on 01.06.2016.
 * Class Directory
 */
public class Directory extends File {

    private final List<File> files = new ArrayList<>();


    public Directory(String name) {
        super(name);
        System.out.println("Directory '" + this.getName() + "' has been created");
    }

    public File getFile(String name) {
        int index = indexOf(name);
        return index >= 0 ? getFile(index) : null;
    }

    public int indexOf(String name) {
        for (int i = 0; i < files.size(); i++) {
            if (files.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public File getFile(int index) {
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
        File file = getFile(name);
        if (file == null) {
            return false;
        }
        if (files.remove(file)) {
            System.out.println("Item '" + name + "' has been deleted from Directory '" + this.getName() + "'");
            return true;
        }
        return false;
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
        open(0);
    }

    public void open(int level) {
        if (level == 0) {
            System.out.println("Opening Directory '" + getName() + "'..." + (files.size() == 0 ? " is Empty" : ""));
        }
        for (File file : files) {
            char[] spaces = new char[level * 3];
            Arrays.fill(spaces, ' ');
            System.out.println(new String(spaces) + "|__" + file);
            if (file instanceof Directory) {
                file.open(level + 1);
            }
        }
    }

    public void copy(File file) throws Exception {
        if (isDeadLock(file)) {
            throw new Exception("Dead Lock Exception");
        }
        File newFile = file.clone();
        files.add(newFile);
    }

    private boolean isDeadLock(File file) {
        if (this == file) {
            return true;
        }
        if (file instanceof Directory) {
            boolean result;
            for (int i = 0; i < ((Directory)file).getFileCount(); i++) {
                result = isDeadLock(((Directory) file).getFile(i));
                if (result) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getFileCount() {
        return files.size();
    }

    public void move(File file, Directory destination) {
        destination.add(file);
        this.delete(file);
    }

}
