package com.gojavaonline3.dlenchuk.module03.musicstore;

import java.util.GregorianCalendar;

/**
 * Created by DLenchuk on 26.05.2016.
 * Class of Guitar
 */
public class Guitar extends MusicalInstrument {

    public Guitar(int id, String producedBy, GregorianCalendar manufactureDate, int price) {
        super(id, producedBy, manufactureDate, Kind.STRINGED, price);
    }

    @Override
    public void play(String notes) {
        System.out.println("Guitarist playing guitar on notes: '" + notes + "'");
    }
}
