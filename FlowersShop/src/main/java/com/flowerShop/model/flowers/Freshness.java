package com.flowerShop.model.flowers;

import java.security.InvalidParameterException;

/**
 * Created by Vasyl_Voloshyn on 5/15/2017.
 */
public enum Freshness {
    FRESH(10),
    SLUGGISH(5),
    NOT_FRESH(0);

    private final int LEVEL;
    private final int MAX = 10;
    private final int MIN = 0;

    public int getLevel(){
        return LEVEL;
    }
    Freshness(int level){
        if(level <=MAX && level >= MIN) {
            LEVEL = level;
        }
        else{
            throw new InvalidParameterException("Level of freshness can't be bigger than "+MAX+ " or less than "+MIN);
        }
    }
}
