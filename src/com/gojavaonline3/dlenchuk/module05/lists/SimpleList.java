package com.gojavaonline3.dlenchuk.module05.lists;

/**
 * Created by Dmitrij Lenchuk on 05.06.2016.
 * Interface SimpleArrayList
 */
public interface SimpleList<T extends Number> {

    public enum SortKind {

        BUBBLE(new Sortable<Comparable>() {
            @Override
            public void sort(Comparable[] list) {
                for (int i = 1; i < list.length; i++) {
                    for (int j = i; j > 0; j--) {
                        if (list[j].compareTo(list[j - 1]) < 0) {
                            Comparable buffer = list[j];
                            list[j] = list[j - 1];
                            list[j - 1] = buffer;
                        }
                    }
                }
            }
        }),
        MERGE(new Sortable<Comparable>() {
            @Override
            public void sort(Comparable[] list) {
                // ToDo;
            }
        }),
        DO_NOT_SORT(new Sortable<Comparable>() {
            @Override
            public void sort(Comparable[] list) {
                // NOP;
            }
        });

        private final Sortable sort;

        SortKind(Sortable sort) {
            this.sort = sort;
        }

        public Sortable getSort() {
            return sort;
        }
    }

    public T min();

    public T max();

    public void sort();

    public Sortable getSort();

    public void setSort(Sortable sort);

    public int length();
}
