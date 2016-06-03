package com.gojavaonline3.dlenchuk.module03.fs;

import java.util.Arrays;

/**
 * Created by Dmitrij Lenchuk on 01.06.2016.
 * Class Image File
 */
public class ImageFile extends File{
    public ImageFile(String name) {
        super(name);
        System.out.println("Image File '" + this.getName() + "' has been created");
    }

    @Override
    public void open() {
        System.out.println("Image File '" + getName() + "' has been opened");
    }

    @Override
    public void open(int level) {
        char[] spaces = new char[level*4];
        Arrays.fill(spaces, ' ');
        System.out.println(new String(spaces) + "Image File '" + getName() + "' has been opened");
    }

}
