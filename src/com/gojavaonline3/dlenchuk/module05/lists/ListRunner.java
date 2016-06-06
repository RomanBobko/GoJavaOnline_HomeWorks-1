package com.gojavaonline3.dlenchuk.module05.lists;

import static com.gojavaonline3.dlenchuk.module05.lists.SimpleList.SortKind.MERGE;

/**
 * Created by Dmitrij Lenchuk on 05.06.2016.
 * List Runner
 */
public class ListRunner {
    public static void main(String[] args) {

        System.out.println("Bubble Sort of Integer...");
        Integer[] arrayOfInteger = new Integer[(int) (Math.random()*1_000)];
        for (int i = 0; i < arrayOfInteger.length; i++) {
            arrayOfInteger[i] = (int) (Math.random()*1_000);
        }
        SimpleList listInteger = new SimpleArrayList<Integer>(arrayOfInteger);
        System.out.println(listInteger);
        sorting(listInteger);

        System.out.println("\nBubble Sort of Double...");
        Double[] arrayOfDouble = new Double[(int) (Math.random()*1_000)];
        for (int i = 0; i < arrayOfDouble.length; i++) {
            arrayOfDouble[i] = Math.random()*1_000;
        }
        SimpleList listDouble = new SimpleArrayList<Double>(arrayOfDouble);
        System.out.println(listDouble);
        sorting(listDouble);

        System.out.println("\nMerge Sort of Float...");
        Float[] arrayOfFloat = new Float[(int) (Math.random()*1_000)];
        for (int i = 0; i < arrayOfFloat.length; i++) {
            arrayOfFloat[i] = new Float(Math.random()*1_000);
        }
        SimpleList listFloat = new SimpleArrayList<Float>(arrayOfFloat);
        listFloat.setSort(MERGE.getSort());
        System.out.println(listFloat);
        sorting(listFloat);
    }

    private static void sorting(SimpleList list) {
        long time = System.nanoTime();
        list.sort();
        System.out.println(list);
        System.out.println("Length of Array: " + list.length());
        System.out.println("Time of Job: " + (System.nanoTime() - time) / 1000 / 1000 + "ms");
    }

}
