package com.company;

import com.company.Cars.Car;
import com.company.MarketingStrategy.RadioMarketing;
import com.company.MarketingStrategy.TVMarketing;
import com.company.PricingStrategy.LuxuryEquipment;
import com.company.PricingStrategy.StandartEquipment;

public class Main {

    public static void main(String[] args) {
        Car vwPassat = new Car(
                "Vw",
                "Passat",
                3000,
                false,
                new TVMarketing(),
                new LuxuryEquipment());

        Car SkodaOctavia = new Car(
                "Skoda",
                "Octavia",
                4000,
                true,
                new RadioMarketing(),
                new StandartEquipment());

        System.out.println(vwPassat.getFinalPrice(10, 30));
        vwPassat.setPricePolicy(new StandartEquipment());
    }
}
