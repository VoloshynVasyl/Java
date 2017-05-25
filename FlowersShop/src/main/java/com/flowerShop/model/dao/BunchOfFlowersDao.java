package com.flowerShop.model.dao;

import com.flowerShop.model.flowers.BunchOfFlowers;
import com.flowerShop.model.flowers.Freshness;

import java.sql.SQLException;

/**
 * Created by Vasyl_Voloshyn on 5/23/2017.
 */
public interface BunchOfFlowersDao {
    public BunchOfFlowers getBunchOfFlowersById(int id) throws SQLException;
    public void createBunchOfFlowers(String id,
            String name,
            String freshness,
            String price,
            String lengthOfStalk,
            String numOfFlowersInBrunch
) throws SQLException;
    public void updateBunchOfFlowers(int id,
                                     String name,
                                     Freshness freshness,
                                     double price,
                                     int lengthOfStalk,
                                     int numOfFlowersInBrunch
    );
    public void deleteBunchOfFlowers(int id);
}
