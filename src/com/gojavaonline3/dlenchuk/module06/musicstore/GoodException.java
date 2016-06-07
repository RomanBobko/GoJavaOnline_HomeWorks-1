package com.gojavaonline3.dlenchuk.module06.musicstore;

/**
 * Created by Dmitrij Lenchuk on 06.06.2016.
 * Exception GoodException
 */
public class GoodException extends Exception {

    private final String good;

    public GoodException(String good) {
        this.good = good;
    }

    public String getGood() {
        return good;
    }

}
