package com.gojavaonline3.dlenchuk.module05.lists;

/**
 * Created by Dmitrij Lenchuk on 05.06.2016.
 * List Runner
 */
public class ListRunner {
    public static void main(String[] args) {
        System.out.println("Merge Sort of Integer...");
        Integer[] arrayOfInteger = new Integer[(int) (Math.random()*1_000)];
        for (int i = 0; i < arrayOfInteger.length; i++) {
            arrayOfInteger[i] = (int) (Math.random()*1_000);
        }
        SimpleArrayList<Integer> listInteger = new SimpleArrayList<>(arrayOfInteger);
        System.out.println(listInteger);
        System.out.println(listInteger.mergeSort());

        System.out.println("\nBubble Sort of Double...");
        Double[] arrayOfDouble = new Double[(int) (Math.random()*1_000)];
        for (int i = 0; i < arrayOfDouble.length; i++) {
            arrayOfDouble[i] = Math.random()*1_000;
        }
        SimpleList listDouble = new SimpleArrayList<Double>(arrayOfDouble);
        System.out.println(listDouble);
        listDouble = sorting(listDouble);

        System.out.println("\nBubble Sort of Float...");
        Float[] arrayOfFloat = new Float[(int) (Math.random()*1_000)];
        for (int i = 0; i < arrayOfFloat.length; i++) {
            arrayOfFloat[i] = new Float(Math.random()*1_000);
        }
        SimpleList listFloat = new SimpleArrayList<Float>(arrayOfFloat);
        System.out.println(listFloat);
        listFloat = sorting(listFloat);

    }

    private static <T extends Number & Comparable<T>> SimpleList<T> sorting(SimpleList<T> list) {
        long time = System.nanoTime();
        SimpleList<T> simpleList = list.bubbleSort();
        System.out.println(simpleList);
        System.out.println("Length of Array: " + list.length());
        System.out.println("Time of Job: " + (System.nanoTime() - time) / 1000 / 1000 + "ms");
        return simpleList;
    }

}
