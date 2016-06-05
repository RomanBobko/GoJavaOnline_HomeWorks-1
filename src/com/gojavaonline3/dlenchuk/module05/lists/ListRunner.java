package com.gojavaonline3.dlenchuk.module05.lists;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Dmitrij Lenchuk on 05.06.2016.
 * List Runner
 */
public class ListRunner {
    public static void main(String[] args) {
//        Generating Array
        int length = (int) (Math.random()*1_000);
        int[] intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = (int) (Math.random()*1_000);
        }

        SimpleArrayList list = new IntSimpleArrayList(intArray);
        System.out.println(list);

        long time = System.nanoTime();
        list.sort();
        System.out.println(list);
        System.out.println("mSec: " + (System.nanoTime() - time)/1000/1000);
    }
}
