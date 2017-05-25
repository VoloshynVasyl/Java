package com.flowerShop.model.flowers;

import java.security.InvalidParameterException;

/**
 * Created by Vasyl_Voloshyn on 5/15/2017.
 */
public enum Role {
    MAIN(10),
    SECONDARY(5),
    ATTACHMENT(0);

    private final int LEVEL;
    private final int MAX = 10;
    private final int MIN = 0;

    Role(int level){
        if(level <=MAX && level >=MIN) {
            LEVEL = level;
        }
        else{
            throw new InvalidParameterException("Role of flower can't be bigger than "+MAX+ " or less than "+MIN);
        }
    }
}
