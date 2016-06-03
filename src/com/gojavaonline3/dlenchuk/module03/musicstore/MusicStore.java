package com.gojavaonline3.dlenchuk.module03.musicstore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmitrij Lenchuk on 26.05.2016.
 * Class Music Store
 */
public class MusicStore {

    private static final MusicStore instance = new MusicStore();
    private final List<MusicalInstrument> musicalInstruments = new ArrayList<>();

    private MusicStore() {}

    public static MusicStore getInstance() {
        return instance;
    }

    public boolean add(MusicalInstrument musicalInstrument) {
        if (musicalInstruments.add(musicalInstrument)) {
            System.out.println("Item " + musicalInstrument + " has been added to Music Store ");
            return true;
        }
        return false;
    }

    public MusicalInstrument get(int id) {
        int index = indexOf(id);
        return index >= 0 ? musicalInstruments.get(index) : null;
    }

    private int indexOf(int id) {
        for (int i = 0; i < musicalInstruments.size(); i++) {
            if (musicalInstruments.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(int id) {
        String item = get(indexOf(id)).toString();
        if (musicalInstruments.remove(get(indexOf(id)))) {
            System.out.println("Item " + item + " has been removed");
            return true;
        }
        return false;
    }

    public void clear() {
        musicalInstruments.clear();
        System.out.println("The Music Store has been cleared");
    }

    public void report() {
        System.out.println(musicalInstruments.size() == 0 ? "The Music Store is empty." : "Reporting...");
        for (MusicalInstrument musicalInstrument : musicalInstruments) {
            System.out.println(musicalInstrument);
        }
        System.out.println("=============================================================================");
        System.out.println("Total amount: $" + getTotalAmount());
    }

    public int getTotalAmount() {
        int result = 0;
        for (MusicalInstrument musicalInstrument : musicalInstruments) {
            result += musicalInstrument.getPrice();
        }
        return result;
    }

    public void playAll(String notes) {
        System.out.println("Concert is started...");
        for(MusicalInstrument musicalInstrument : musicalInstruments) {
            musicalInstrument.play(notes);
        }
        System.out.println("Concert is finished...");
    }
}
