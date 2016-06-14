package com.gojavaonline3.dlenchuk.module04.area;

/**
 * Created by Dmitrij Lenchuk on 07.06.2016.
 * Exception FigureExistenceIsImpossibleException
 */
public class FigureExistenceIsImpossibleException extends Exception {

    private final String msg;

    public FigureExistenceIsImpossibleException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}
