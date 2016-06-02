package com.gojavaonline3.dlenchuk.module03.musicstore;

import java.util.GregorianCalendar;

/**
 * Created by DLenchuk on 26.05.2016.
 * Class of Piano
 */
public class Piano extends MusicalInstrument {

    public Piano(int id, String producedBy, GregorianCalendar manufactureDate, int price) {
        super(id, producedBy, manufactureDate, Kind.KEYBOARDS, price);
    }

    @Override
    public void play(String notes) {
        System.out.println("Pianist plays piano on notes: '" + notes + "'");
    }
}
