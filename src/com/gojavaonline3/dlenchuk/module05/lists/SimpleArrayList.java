package com.gojavaonline3.dlenchuk.module05.lists;

import java.util.Arrays;

import static com.gojavaonline3.dlenchuk.module05.lists.SimpleList.SortKind.*;

/**
 * Created by Dmitrij Lenchuk on 04.06.2016.
 * Class Simple Array List
 */
public class SimpleArrayList<T extends Number & Comparable> implements SimpleList<T> {

    private final T[] list;
    private boolean sorted = false;

    SimpleArrayList(T[] list) {
        this.list = list;
        checkList();
    }

    private Sortable sort = BUBBLE.getSort();

    @Override
    public Sortable getSort() {
        return sort;
    }

    @Override
    public void setSort(Sortable sort) {
        this.sort = sort;
    }

    @Override
    public int length() {
        return list.length;
    }

    private void checkList() throws IllegalArgumentException {
        if (list == null || list.length == 0) {
            throw new IllegalArgumentException("List must be not null and have one item at least");
        }
    }

    @Override
    public void sort() {
        if (!sorted) {
            sort.sort(list);
            sorted = true;
        }
    }

    @Override
    public T min() {
        if (sorted) {
            return list[0];
        } else {
            T min = list[0];
            for (int i = 1; i < list.length; i++) {
                if (min.compareTo(list[i]) > 0) {
                    min = list[i];
                }
            }
            return min;
        }
    }

    @Override
    public T max() {
        if (sorted) {
            return list[list.length - 1];
        } else {
            T max = list[0];
            for (int i = 1; i < list.length; i++) {
                if (max.compareTo(list[i]) < 0) {
                    max = list[i];
                }
            }
            return max;
        }
    }

    @Override
    public String toString() {
        return "IntSimpleArrayList(min=" + min() + ";max=" + max() + "){" +
                "list=" + Arrays.toString(list) +
                '}';
    }
}
