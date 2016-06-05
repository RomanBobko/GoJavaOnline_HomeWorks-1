package com.gojavaonline3.dlenchuk.module05;

/**
 * Created by Dmitrij Lenchuk on 04.06.2016.
 * Class Simple Array List
 */
public class SimpleArrayList<T> {
    private final T[] list;

    public SimpleArrayList(T[] list) {
        this.list = list;
        checkList();
        sort();
    }

    private void checkList() throws IllegalArgumentException {
        if (list == null || list.length == 0) {
            throw new IllegalArgumentException("List must be not null and have one item at least");
        }
    }

    private void sort() {
//        ToDo
    }

    public T min() {
        return list[0];
    }

    public T max() {
        return list[list.length - 1];
    }
}
