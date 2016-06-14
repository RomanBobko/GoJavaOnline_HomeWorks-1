package com.gojavaonline3.dlenchuk.module04.temperature;

/**
 * Created by Dmitrij Lenchuk on 07.06.2016.
 * Exception IllegalUnitOfTemperatureException
 */
public class IllegalUnitOfTemperatureException extends TemperatureException {

    private final String unitName;

    public IllegalUnitOfTemperatureException(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitName() {
        return unitName;
    }

}
