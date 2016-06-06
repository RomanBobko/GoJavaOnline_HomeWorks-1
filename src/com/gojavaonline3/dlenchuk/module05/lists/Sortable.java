package com.gojavaonline3.dlenchuk.module05.lists;

/**
 * Created by Dmitrij Lenchuk on 06.06.2016.
 * Interface Sortable
 */
public interface Sortable<T extends Comparable> {
    public void sort(T[] list);
}
