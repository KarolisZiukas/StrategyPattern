package com.company.Cars;

import com.company.MarketingStrategy.MarketingPolicy;
import com.company.PricingStrategy.PricePolicy;

public class Car {

    private MarketingPolicy marketingPolicy;
    private PricePolicy pricePolicy;

    private String carMake;
    private String carModel;
    private int carBasePrice;
    private boolean isEnsured;

    public Car(
            String carMake,
            String carModel,
            int carBasePrice,
            boolean isEnsured,
            MarketingPolicy marketingPolicy,
            PricePolicy pricePolicy
    ) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carBasePrice = carBasePrice;
        this.isEnsured = isEnsured;
        this.pricePolicy = pricePolicy;
        this.marketingPolicy = marketingPolicy;

    }

    public double getFinalPrice(int numberOfDays, double duration) {
        return marketingPolicy.getCommercialPrice(numberOfDays, duration)
                + pricePolicy.calculateCarPrice(carBasePrice, isEnsured);
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarBasePrice() {
        return carBasePrice;
    }

    public void setCarBasePrice(int carBasePrice) {
        this.carBasePrice = carBasePrice;
    }

    public void setMarketingPolicy(MarketingPolicy marketingPolicy) {
        this.marketingPolicy = marketingPolicy;
    }

    public void setPricePolicy(PricePolicy pricePolicy) {
        this.pricePolicy = pricePolicy;
    }

}
