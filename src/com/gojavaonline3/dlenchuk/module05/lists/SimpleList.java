package com.gojavaonline3.dlenchuk.module05.lists;

/**
 * Created by Dmitrij Lenchuk on 05.06.2016.
 * Interface SimpleArrayList
 */
public interface SimpleList<T extends Number & Comparable<T>> {

    /*ToDo
    * Не знаю какой это антипаттерн, но очень хочется соединить методы bubbleSort() и mergeSort()
    * в метод sort() и давать возможность пользователю выбирать стратегию сортировки
    * */

    public T min();

    public T max();

    public SimpleArrayList<T> bubbleSort();

    public SimpleList<T> mergeSort();

    public int length();
}
