package io.zipcoder.currencyconverterapplication;

import org.omg.CORBA.Current;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {

        return currencyType.getRate()/this.getType().getRate();
    }

  CurrencyType getType();

}
