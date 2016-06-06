package com.gojavaonline3.dlenchuk.module05.lists;

import static com.gojavaonline3.dlenchuk.module05.lists.SimpleList.SortKind.MERGE;

/**
 * Created by Dmitrij Lenchuk on 05.06.2016.
 * List Runner
 */
public class ListRunner {
    public static void main(String[] args) {

        System.out.println("Bubble Sort...");
        SimpleList list1 = new SimpleArrayList(generate());
        System.out.println(list1);
        sorting(list1);

        System.out.println();
        System.out.println("Merge Sort...");
        SimpleList list2 = new SimpleArrayList(generate());
        System.out.println(list2);
        list2.setSort(MERGE.getSort());
        sorting(list2);

        System.out.println();
        System.out.println("No Sort...");
        SimpleList list3 = new SimpleArrayList(generate());
        System.out.println(list3);
        list2.setSort(MERGE.getSort());
        sorting(list3);
    }

    private static void sorting(SimpleList list) {
        long time = System.nanoTime();
        list.sort();
        System.out.println(list);
        System.out.println("Length of Array: " + list.length());
        System.out.println("Time of Job: " + (System.nanoTime() - time)/1000/1000 + "ms");
    }

    private static int[] generate() {
        int[] array = new int[(int) (Math.random()*1_000)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*1_000);
        }
        return array;
    }

}
