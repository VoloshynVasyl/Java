package com.flowerShop.model.accessories;

import com.flowerShop.model.Bouquet;
import com.flowerShop.model.BouquetElements;
import com.flowerShop.model.flowers.Freshness;
import com.flowerShop.model.flowers.Role;

/**
 * Created by Vasyl_Voloshyn on 5/15/2017.
 */
public class Wrapper implements BouquetElements{
    private String name;
    private double price;
    private WrapperType type;
    private Role role;
    public Wrapper(String name, WrapperType type, double price){
        setName(name);
        setType(type);
        setPrice(price);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public Freshness getFreshness() {
        return null;
    }

    public int getLengthOfStalk() {
        return 0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public WrapperType getType() {
        return type;
    }
    public void setType(WrapperType type) {
        this.type = type;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
