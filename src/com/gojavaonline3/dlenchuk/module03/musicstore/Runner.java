package com.gojavaonline3.dlenchuk.module03.musicstore;

import java.util.GregorianCalendar;

/**
 * Created by Dmitrij Lenchuk on 01.06.2016.
 * Runner Music Store
 */
public class Runner {
    public static void main(String[] args) {
        int sequenceId = 0;
        MusicStore store = MusicStore.getInstance();

        store.report();

        System.out.println();
        store.add(new Trumpet(sequenceId++, "Mordor", new GregorianCalendar(1000, 11, 12), 1_000_000_000));
        store.add(new Guitar(sequenceId++, "Stradivary", new GregorianCalendar(1677, 11, 31), 500_000_000));
        store.add(new Piano(sequenceId++, "Kawai Musical Instruments", new GregorianCalendar(1800, 10, 30), 50_000_000));
        store.add(new Piano(sequenceId++, "Bösendorfer", new GregorianCalendar(1815, 9, 18), 40_000_000));
        store.add(new Trumpet(sequenceId++, "Buffet-Crampon", new GregorianCalendar(1845, 4, 15), 5_000_000));
        store.add(new Trumpet(sequenceId++, "Steinway Musical Instruments", new GregorianCalendar(1913, 11, 19), 1_000_000));
        store.add(new Piano(sequenceId++, "Lesopilka #3 Stoljarnij Ceh #4 Best Of The World", new GregorianCalendar(1934, 11, 5), 1_000));
        store.add(new Guitar(sequenceId++, "Vorkuta Ltd", new GregorianCalendar(1949, 10, 15), 30));
        store.add(new Guitar(sequenceId++, "Bukovina", new GregorianCalendar(1979, 5, 11), 25));
        store.add(new Guitar(sequenceId++, "USA Rock Club", new GregorianCalendar(1984, 3, 13), 500));
        store.add(new Piano(sequenceId++, "Yamaha", new GregorianCalendar(1999, 1, 16), 5_000));
        store.add(new Trumpet(sequenceId, "Vandoren", new GregorianCalendar(2001, 1, 3), 1_000));

        System.out.println();
        store.report();

        System.out.println();
        System.out.println("Instruments are configuring...");
        store.get(10).play("Rahmaninov Simph.#1 for piano");
        store.get(9).play("Romans");
        store.get(4).play("Get up");

        try {
            System.out.print("Playing not existed item... ");
            store.get(4000).play("Get up");
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        System.out.println();
        store.playAll("Rahmaninov Simph.#1 for piano with orchestra");

        System.out.println();
        store.remove(10);
        try {
            System.out.print("Removing not existed item... ");
            store.remove(1258);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        System.out.println();
        store.report();

        System.out.println();
        store.clear();

        System.out.println();
        store.report();
    }
}
