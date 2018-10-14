package com.company.MarketingStrategy;

import com.company.Utils.MinutesHelper;

public class RadioMarketing implements MarketingPolicy {


    private static final int BASE_RADIO_COMMERCIAL_PRICE = 200;

    @Override
    public double getCommercialPrice(int numberOfDays, double duration) {
        return calculateMarketingPrice(numberOfDays, duration);
    }

    @Override
    public double calculateMarketingPrice(int numberOfDays, double duration) {
        return numberOfDays * BASE_RADIO_COMMERCIAL_PRICE * MinutesHelper.getDurationInMinutes(duration);

    }

}
