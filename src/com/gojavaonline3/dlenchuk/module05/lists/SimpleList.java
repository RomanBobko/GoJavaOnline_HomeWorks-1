package com.gojavaonline3.dlenchuk.module05.lists;

/**
 * Created by Dmitrij Lenchuk on 05.06.2016.
 * Interface SimpleArrayList
 */
public interface SimpleList<T extends Number & Comparable<T>> {

    public T min();

    public T max();

    public SimpleArrayList<T> bubbleSort();

    public SimpleList<T> mergeSort();

    public int length();
}
