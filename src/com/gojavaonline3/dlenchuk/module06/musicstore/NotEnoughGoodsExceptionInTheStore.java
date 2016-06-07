package com.gojavaonline3.dlenchuk.module06.musicstore;

/**
 * Created by Dmitrij Lenchuk on 07.06.2016.
 * Exception NotEnoughGoodsException
 */
public class NotEnoughGoodsExceptionInTheStore extends GoodException {
    private final int orderedCount;
    private final int existedCount;

    public NotEnoughGoodsExceptionInTheStore(String good, int orderedCount, int existedCount) {
        super(good);
        this.orderedCount = orderedCount;
        this.existedCount = existedCount;
    }

    public int getOrderedCount() {
        return orderedCount;
    }

    public int getExistedCount() {
        return existedCount;
    }
}
