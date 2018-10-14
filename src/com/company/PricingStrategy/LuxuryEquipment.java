package com.company.PricingStrategy;

import com.company.Utils.Consts;

public class LuxuryEquipment implements PricePolicy{

    private static final double LUXURY_EQUIPMENT_PRICE = 0.30;

    @Override
    public double calculateCarPrice(int carBasePrice, boolean isEnsured) {
        return carBasePrice + calculateCarPriceWithEquipment(carBasePrice) + getInsuredCarPrice(isEnsured, carBasePrice);
    }

    private double getInsuredCarPrice(boolean isEnsured, int carBasePrice) {
        if(isEnsured) {
            return carBasePrice * Consts.ENSURANCE_PRICE;
        } else {
            return 0;
        }
    }

    private double calculateCarPriceWithEquipment(int carBasePrice) {
        return carBasePrice * LUXURY_EQUIPMENT_PRICE;

    }

}
