package com.flowerShop.model;

import com.flowerShop.model.flowers.Freshness;
import com.flowerShop.model.flowers.Role;
/**
 * Created by Vasyl_Voloshyn on 5/15/2017.
 */
public interface BouquetElements {
    public void setRole(Role role);
    public double getPrice();
    public Freshness getFreshness();
    public int getLengthOfStalk();
    public String getName();
}
