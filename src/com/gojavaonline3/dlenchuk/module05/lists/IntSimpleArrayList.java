package com.gojavaonline3.dlenchuk.module05.lists;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Dmitrij Lenchuk on 04.06.2016.
 * Class Simple Array List
 */
public class IntSimpleArrayList implements SimpleArrayList {

    private final int[] list;
    private boolean sorted = false;

    IntSimpleArrayList(int[] list) {
        this.list = list;
        checkList();
    }

    private void checkList() throws IllegalArgumentException {
        if (list == null || list.length == 0) {
            throw new IllegalArgumentException("List must be not null and have one item at least");
        }
    }

    @Override
    public void sort() {
        if (!sorted) {
            for (int i = 1; i < list.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (list[j] < list[j - 1]) {
                        int buffer = list[j];
                        list[j] = list[j - 1];
                        list[j - 1] = buffer;
                    }
                }
            }
            sorted = true;
        }
    }

    @Override
    public void setupSort(SortKind sortKind) {

    }

    @Override
    public int min() {
        if (sorted) {
            return list[0];
        } else {
            int min = list[0];
            for (int i = 1; i < list.length; i++) {
                if (min > list[i]) {
                    min = list[i];
                }
            }
            return min;
        }
    }

    @Override
    public int max() {
        if (sorted) {
            return list[list.length - 1];
        } else {
            int max = list[0];
            for (int i = 1; i < list.length; i++) {
                if (max < list[i]) {
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
