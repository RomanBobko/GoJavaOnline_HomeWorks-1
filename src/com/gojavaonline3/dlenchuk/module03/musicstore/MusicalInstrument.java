package com.gojavaonline3.dlenchuk.module03.musicstore;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Dmitrij Lenchuk on 26.05.2016.
 * Class of Musical Instrument
 */
public abstract class MusicalInstrument {

    private final int id;
    private final String producedBy;
    private final GregorianCalendar manufactureDate;
    private final Kind kind;
    private final int price;


    public MusicalInstrument(int id, String producedBy, GregorianCalendar manufactureDate, Kind kind, int price) {
        this.id = id;
        this.producedBy = producedBy;
        this.manufactureDate = manufactureDate;
        this.kind = kind;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getProducedBy() {
        return producedBy;
    }

    public GregorianCalendar getManufactureDate() {
        return manufactureDate;
    }

    public Kind getKind() {
        return kind;
    }

    public int getPrice() {
        return price;
    }

    public abstract void play(String notes);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MusicalInstrument)) return false;

        MusicalInstrument that = (MusicalInstrument) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {

        String date = "" + manufactureDate.get(Calendar.DAY_OF_MONTH) + '.' +
                manufactureDate.get(Calendar.MONTH) + '.' +
                manufactureDate.get(Calendar.YEAR) ;
        return  this.getClass().getSimpleName() +
                '{' + id +"; " + producedBy + "; " + date + "; " + kind + "; " + price + '}';
    }
}
