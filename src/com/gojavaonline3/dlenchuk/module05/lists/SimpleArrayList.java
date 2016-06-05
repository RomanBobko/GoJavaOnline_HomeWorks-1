package com.gojavaonline3.dlenchuk.module05.lists;

/**
 * Created by Dmitrij Lenchuk on 05.06.2016.
 * Interface SimpleArrayList
 */
public interface SimpleArrayList {

    public static enum SortKind {
        BUBBLE,
        NO_SORT
    }

    public int min();

    public int max();

    public void sort();

    public void setupSort(SortKind sortKind);
}
