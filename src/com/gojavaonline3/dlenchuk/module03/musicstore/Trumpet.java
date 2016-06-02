package com.gojavaonline3.dlenchuk.module03.musicstore;

import java.util.GregorianCalendar;

/**
 * Created by DLenchuk on 26.05.2016.
 * Class of Trumpet
 */
public class Trumpet extends MusicalInstrument {

    public Trumpet(int id, String producedBy, GregorianCalendar manufactureDate, int price) {
        super(id, producedBy, manufactureDate, Kind.WINDS, price);
    }

    @Override
    public void play(String notes) {
        System.out.println("Trumpeter playing trumpet on notes: '" + notes + "'");
    }
}
