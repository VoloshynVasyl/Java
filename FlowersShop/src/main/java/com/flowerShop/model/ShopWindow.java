package com.flowerShop.model;

import java.util.List;
import java.util.ArrayList;
/**
 * Created by Vasyl_Voloshyn on 5/16/2017.
 */
public class ShopWindow {
    List<Bouquet> shopWindow = new ArrayList<Bouquet>();

    public void addBouquetToShopWindow(Bouquet shopWindow) {
        this.shopWindow.add(shopWindow);
    }
    public Bouquet getBouquetFromShopWindowByIndex(int index) {
        return shopWindow.get(index);
    }
    
    @Override
    public String toString(){
        String tmp = "";
        int i = 0;
        for (Bouquet b : shopWindow) {
            tmp += i + ". Bouquet's name: " + b.getName()+ " "+b.getPrice()+" hrn.\n";
            i++;
        }
        return tmp;
    }
}
