package com.gojavaonline3.dlenchuk.module06.musicstore;

/**
 * Created by Dmitrij Lenchuk on 06.06.2016.
 * Exception CountOfGoodsException
 */
public class CountOfGoodsException extends GoodException {

    private final int count;

    public CountOfGoodsException(String good, int count) {
        super(good);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

}
