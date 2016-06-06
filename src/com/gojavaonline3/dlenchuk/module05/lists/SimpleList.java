package com.gojavaonline3.dlenchuk.module05.lists;

/**
 * Created by Dmitrij Lenchuk on 05.06.2016.
 * Interface SimpleArrayList
 */
public interface SimpleList<T extends Number & Comparable> {

    public T min();

    public T max();

    public void sort();

    public int length();
}
