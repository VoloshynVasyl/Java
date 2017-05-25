package com.flowerShop.model;

import java.util.List;
import java.util.ArrayList;

import com.flowerShop.model.flowers.BunchOfFlowers;
import com.flowerShop.model.accessories.Wrapper;
import com.flowerShop.model.flowers.Freshness;
import com.flowerShop.model.flowers.Role;
/**
 * Created by Vasyl_Voloshyn on 5/15/2017.
 */
public class Bouquet {
    List<BouquetElements> bouquet = new ArrayList<BouquetElements>();
    String name;
    double price;
    Freshness freshness;
    int lengthOfStalk;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setLengthOfStalk(int lengthOfStalk) {
        this.lengthOfStalk = lengthOfStalk;
    }

    public void setBouquet(List<BouquetElements> bouquet) {
        this.bouquet = bouquet;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return getName();
    }
}
