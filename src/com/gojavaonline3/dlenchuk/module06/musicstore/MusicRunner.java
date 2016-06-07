package com.gojavaonline3.dlenchuk.module06.musicstore;

import java.util.*;

/**
 * Created by Dmitrij Lenchuk on 01.06.2016.
 * Runner Music Store
 */
public class MusicRunner {

    private static MusicStore store = MusicStore.getInstance();

    public static void main(String[] args) {
        int sequenceId = 0;

        store.report();

        System.out.println();
        System.out.println("The Music Store has been Filling...");
        store.add(new Trumpet(sequenceId++, "Mordor", new GregorianCalendar(1000, 11, 12), 1_000_000_000));
        store.add(new Guitar(sequenceId++, "Stradivary", new GregorianCalendar(1677, 11, 31), 500_000_000));
        store.add(new Piano(sequenceId++, "Kawai Musical Instruments", new GregorianCalendar(1800, 10, 30), 50_000_000));
        store.add(new Guitar(sequenceId++, "Vorkuta Ltd", new GregorianCalendar(1949, 10, 15), 30));
        store.add(new Guitar(sequenceId++, "USA Rock Club", new GregorianCalendar(1984, 3, 13), 500));
        store.add(new Trumpet(sequenceId++, "Buffet-Crampon", new GregorianCalendar(1845, 4, 15), 5_000_000));
        store.add(new Guitar(sequenceId++, "Stradivary", new GregorianCalendar(1677, 11, 31), 500_000_000));
        store.add(new Guitar(sequenceId++, "Stradivary", new GregorianCalendar(1677, 11, 31), 500_000_000));
        store.add(new Trumpet(sequenceId++, "Steinway Musical Instruments", new GregorianCalendar(1913, 11, 19), 1_000_000));
        store.add(new Guitar(sequenceId++, "USA Rock Club", new GregorianCalendar(1984, 3, 13), 500));
        store.add(new Guitar(sequenceId++, "Vorkuta Ltd", new GregorianCalendar(1949, 10, 15), 30));
        store.add(new Guitar(sequenceId++, "Bukovina", new GregorianCalendar(1979, 5, 11), 25));
        store.add(new Guitar(sequenceId++, "USA Rock Club", new GregorianCalendar(1984, 3, 13), 500));
        store.add(new Guitar(sequenceId++, "Vorkuta Ltd", new GregorianCalendar(1949, 10, 15), 30));
        store.add(new Trumpet(sequenceId++, "Buffet-Crampon", new GregorianCalendar(1845, 4, 15), 5_000_000));
        store.add(new Guitar(sequenceId++, "USA Rock Club", new GregorianCalendar(1984, 3, 13), 500));
        store.add(new Guitar(sequenceId++, "Vorkuta Ltd", new GregorianCalendar(1949, 10, 15), 30));
        store.add(new Trumpet(sequenceId++, "Steinway Musical Instruments", new GregorianCalendar(1913, 11, 19), 1_000_000));
        store.add(new Piano(sequenceId++, "Yamaha", new GregorianCalendar(1999, 1, 16), 5_000));
        store.add(new Guitar(sequenceId++, "USA Rock Club", new GregorianCalendar(1984, 3, 13), 500));
        store.add(new Trumpet(sequenceId++, "Steinway Musical Instruments", new GregorianCalendar(1913, 11, 19), 1_000_000));
        store.add(new Guitar(sequenceId++, "Stradivary", new GregorianCalendar(1677, 11, 31), 500_000_000));
        store.add(new Guitar(sequenceId++, "Vorkuta Ltd", new GregorianCalendar(1949, 10, 15), 30));
        store.add(new Guitar(sequenceId++, "Stradivary", new GregorianCalendar(1677, 11, 31), 500_000_000));
        store.add(new Trumpet(sequenceId, "Vandoren", new GregorianCalendar(2001, 1, 3), 1_000));

        System.out.println();
        store.report();

        /*Preparing and shipping goods*/
//        1. в магазине было 2 фортепиано, 16 гитар и 7 труб.
//        2. пришел заказ на 7 гитар и 2 трубы.
        Map<String, Integer> order01 = new HashMap<>();
        order01.put("guitar", 7);
        order01.put("trumpet", 2);
        orderExecute(order01);
//        3. после выполнения заказа в магазине осталось 2 фортепиано, 9 гитар и 5 труб
        System.out.println();
        store.report();

//        4. пришел заказ на 1 фортепиано
        Map<String, Integer> order02 = new HashMap<>();
        order02.put("piano", 1);
        orderExecute(order02);
//        5. после выполнения заказа в магазине осталось 1 фортепиано, 9 гитар и 5 труб
        System.out.println();
        store.report();

//        6. пришел заказ на 1 фортепиано, 8 гитар и 6 труб
        Map<String, Integer> order03 = new HashMap<>();
        order03.put("piano", 1);
        order03.put("guitar", 8);
        order03.put("trumpet", 6);
        orderExecute(order03);
//        7. товар не был отгружен (было брошено исключение)
//        8. в магазине осталось 1 фортепиано, 9 гитар и 5 труб
        System.out.println();
        store.report();
    }

    public static void orderExecute(Map<String, Integer> goods) {
        try {
            System.out.println();
            System.out.println("The goods ordered: " + goods);
            List<MusicalInstrument> shippedGoods = store.prepareInstruments(goods);
            System.out.println("The goods shipped: " + shippedGoods);
        } catch (NotEnoughGoodsExceptionInTheStore e) {
            System.out.println("There aren't enough goods '" + e.getGood() + "' in the Music Store. Ordered '" + e.getOrderedCount() + "', but '" + e.getExistedCount() + "' present.");
        } catch (CountOfGoodsException e) {
            System.out.println("The count of goods must be a positive. Count of goods '" + e.getGood() + "' is '" + e.getCount() + "'.");
        } catch (GoodException e) {
            System.out.println("Such goods '" + e.getGood() + "' is not presented in the Music Store. Valid values are " + Arrays.toString(MusicStore.Goods.values()));
        }

    }
}
