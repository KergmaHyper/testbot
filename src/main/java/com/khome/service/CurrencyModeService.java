package com.khome.service;

import com.khome.entity.Currency;

// import com.khome.entity.Currency;

public interface CurrencyModeService {

    // static CurrencyModeService getInstance(){return new HashMapCurrencyModeService();}
    Currency getOriginalCurrency(long chatId);
    Currency getTargetCurrency(long chatId);
    void setOriginalCurrency(long chatId, Currency currency);
    void setTargetCurrency(long chatId, Currency currency);
}
