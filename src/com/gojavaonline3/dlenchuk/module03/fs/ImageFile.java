package com.gojavaonline3.dlenchuk.module03.fs;

/**
 * Created by Dmitrij Lenchuk on 01.06.2016.
 * Class Image File
 */
public class ImageFile extends File{

    ImageFile(String name) {
        super(name);
        System.out.println("Image File '" + this.getName() + "' has been created");
    }

    @Override
    public void open() {
        System.out.println("Image File '" + getName() + "' has been opened");
    }

}
