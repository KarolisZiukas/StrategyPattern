package com.company.MarketingStrategy;

import com.company.Utils.MinutesHelper;

public class TVMarketing implements MarketingPolicy {

    private static final int BASE_TV_COMMERCIAL_PRICE = 400;

    @Override
    public double getCommercialPrice(int numberOfDays, double duration) {
        return calculateMarketingPrice(numberOfDays, duration);
    }

    @Override
    public double calculateMarketingPrice(int numberOfDays, double duration) {
        return numberOfDays * BASE_TV_COMMERCIAL_PRICE * MinutesHelper.getDurationInMinutes(duration);
    }



}
