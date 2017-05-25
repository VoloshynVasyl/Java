package com.flowerShop.model.flowers;

/**
 * Created by Vasyl_Voloshyn on 5/16/2017.
 */
public class BunchOfFlowersBuilder {
    private String name;
    private Freshness freshness;
    private double price;
    private int lengthOfStalk;
    private int numOfFlowersInBunch;
    private Role role;

    public BunchOfFlowersBuilder buildName(String name){
        this.name = name;
        return this;
    }
    public BunchOfFlowersBuilder buildFreshness(Freshness freshness){
        this.freshness = freshness;
        return this;
    }
    public BunchOfFlowersBuilder buildPrice(double price){
        this.price = price;
        return this;
    }
    public BunchOfFlowersBuilder buildLengthOfStalk(int lengthOfStalk){
        this.lengthOfStalk = lengthOfStalk;
        return this;
    }
    public BunchOfFlowersBuilder buildNumOfFlowersInBunch(int numOfFlowersInBunch){
        this.numOfFlowersInBunch = numOfFlowersInBunch;
        return this;
    }
    public BunchOfFlowersBuilder buildRole(Role role){
        this.role = role;
        return this;
    }

    public BunchOfFlowers build(){
        return new BunchOfFlowers(name, price, freshness, lengthOfStalk, numOfFlowersInBunch);
    }
}
