package com.company.MarketingStrategy;

public interface MarketingPolicy {

    double calculateMarketingPrice(int numberOfDays, double duration);

    double getCommercialPrice(int numberOfDays, double duration);

}
