package com.gojavaonline3.dlenchuk.module03.flowers;

import java.util.List;

/**
 * Created by Dmitrij Lenchuk on 01.06.2016.
 * Runner Of Flowers
 */
public class Runner {
    public static void main(String[] args) {
//        new Rose(Color.RED, 70, true, State.BUD);
//        new Aster(Color.WHITE, 40, false, State.SPROUT);
//        new Chamomile(Color.BLUE, 80, false, State.OPENED);
//        new Tulip(Color.BLACK, 50, false, State.WILT);

        Rosebush rosebush = new Rosebush(Color.BLACK, true);
        for (int i = 0; i < 100; i++) {
            rosebush.grow();
        }
        System.out.println(rosebush);


        System.out.println();
        System.out.println("Trimming OPENED...");
        List<Flower> openedRoses = rosebush.trim(State.OPENED, 50);
        System.out.println(openedRoses);
        System.out.println("Trimmed rosebush...");
        System.out.println(rosebush);

        System.out.println();
        System.out.println("Creating bouquet...");
        BouquetOfFlowers bouquetOfOpenedRoses = new BouquetOfFlowers();
        bouquetOfOpenedRoses.add(openedRoses);
        System.out.println(bouquetOfOpenedRoses);
        System.out.println("Compositing bouquet...");
        bouquetOfOpenedRoses.add(new Aster(Color.WHITE, 50, false, State.OPENED));
        bouquetOfOpenedRoses.add(new Tulip(Color.YELLOW, 50, false, State.BUD));
        bouquetOfOpenedRoses.add(new Chamomile(Color.BLUE, 50, false, State.OPENED));
        System.out.println(bouquetOfOpenedRoses);


        System.out.println();
        System.out.println("Trimming WILT...");
        System.out.println(rosebush.trim(State.WILT, 0));
        System.out.println(rosebush);

        System.out.println();
        System.out.println("Trimming all...");
        System.out.println(rosebush.trim());
        System.out.println(rosebush);

        System.out.println();
        System.out.println(bouquetOfOpenedRoses);
        System.out.println("Remove flower from center...");
        if (bouquetOfOpenedRoses.size() > 0) {
            bouquetOfOpenedRoses.remove((int)(bouquetOfOpenedRoses.size()/2));
        }
        System.out.println(bouquetOfOpenedRoses);
    }
}
