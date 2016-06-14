package com.gojavaonline3.dlenchuk.module08;

import com.gojavaonline3.dlenchuk.module03.flowers.Color;
import com.gojavaonline3.dlenchuk.module03.flowers.Rosebush;

import java.util.ArrayList;

/**
 * Created by Dmitrij Lenchuk on 14.06.2016.
 * Collections Runner
 */
public class CollectionsRunner {
    public static void main(String[] args) {
        final ArrayList<Rosebush> greenhouse = new ArrayList<>();

        for (int i = 0; i < (int) (Math.random() * 1000); i++) {
            final Rosebush rosebush = new Rosebush(Color.values()[(int) (Math.random() * 8)], (int) (Math.random() * 2) == 1);
            greenhouse.add(rosebush);
            for (int j = 0; j < (int) (Math.random() * 100); j++) {
                rosebush.grow();
            }
        }

        System.out.println("Review the greenhouse: ");
        greenhouse
                .stream()
                .forEach(System.out::println);

    }
}
