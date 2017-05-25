package com.flowerShop.model;

import com.flowerShop.model.flowers.Freshness;
import com.flowerShop.model.flowers.Role;

import javax.management.InvalidAttributeValueException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vasyl_Voloshyn on 5/16/2017.
 */
public class BouquetBuilder {
    List<BouquetElements> bouquet = new ArrayList<BouquetElements>();
    //double maxPrice;
    String name;
    Freshness freshness;
    int lengthOfStalk;
    double price;

    /*public BouquetBuilder setMaxPrice(double price){
        this.maxPrice = price;
        return this;
    }

    public BouquetBuilder setLengthOfStalk(int lengthOfStalk){
        this.lengthOfStalk = lengthOfStalk;
        return this;
    }

    public BouquetBuilder setFreshness(Freshness freshness){
        this.freshness = freshness;
        return this;
    }*/

    public BouquetBuilder addElemToBouquet(BouquetElements element, Role role) throws InvalidAttributeValueException{
        if(element.getLengthOfStalk() != 0 && lengthOfStalk != 0) {
            if (element.getLengthOfStalk() != lengthOfStalk) {
                throw new InvalidAttributeValueException("Invalid length of stalk. Have to be equal");
            }
        }
        if(element.getFreshness() != null && freshness != null) {
            if (element.getFreshness().getLevel() < freshness.getLevel()) {
                throw new InvalidAttributeValueException("Freshness can't be less than freshness of first added element");
            }
        }
        bouquet.add(element);
        element.setRole(role);
        price += element.getPrice();
        if(element.getFreshness() !=null && element.getLengthOfStalk() != 0) {
            freshness = element.getFreshness();
            lengthOfStalk = element.getLengthOfStalk();
        }
        return this;
    }

    public Bouquet build(String name){
        Bouquet b = new Bouquet();

        b.setBouquet(bouquet);
        b.setLengthOfStalk(lengthOfStalk);
        b.setPrice(price);
        b.setFreshness(freshness);
        b.setName(name);

        return b;
    }
}
