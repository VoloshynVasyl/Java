package com.flowerShop.model.flowers;

import com.flowerShop.model.Bouquet;
import com.flowerShop.model.BouquetElements;
/**
 * Created by Vasyl_Voloshyn on 5/15/2017.
 */
public class BunchOfFlowers implements BouquetElements{
    private int id;
    private String name;
    private Freshness freshness;
    private double price;
    private int lengthOfStalk;
    private int numOfFlowersInBunch;
    private Role role;

    public BunchOfFlowers(String name, double price, Freshness freshness, int lengthOfStalk, int numOfFlowersInBunch){
        setName(name);
        setPrice(price);
        setFreshness(freshness);
        setLengthOfStalk(lengthOfStalk);
        setNumOfFlowersInBunch(numOfFlowersInBunch);
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Freshness getFreshness(){
        return freshness;
    }
    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }

    //return price of all flower in bunch
    public double getPrice() {
        return price*getNumOfFlowersInBunch();
    }

    //price of one flower
    public void setPrice(double price) {
        this.price = price;
    }

    public int getLengthOfStalk() {
        return lengthOfStalk;
    }
    public void setLengthOfStalk(int lengthOfStalk) {
        this.lengthOfStalk = lengthOfStalk;
    }

    public int getNumOfFlowersInBunch() {
        return numOfFlowersInBunch;
    }
    public void setNumOfFlowersInBunch(int numOfFlowersInBunch) {
        this.numOfFlowersInBunch = numOfFlowersInBunch;
    }

    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    
    @Override
    public String toString(){
		return this.getName() + " [price: "+ this.getPrice() +", freshness: "+ this.getFreshness()+", length of stalk: "+this.getLengthOfStalk()+", number of flowers: "+this.getNumOfFlowersInBunch() +"]";    	
    }
}
