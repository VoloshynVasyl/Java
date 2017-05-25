package com.flowerShop;

import com.flowerShop.model.flowers.BunchOfFlowers;
import com.flowerShop.model.dao.BunchOfFlowersDao;
import com.flowerShop.model.dao.implementation.BunchOfFlowersDaoImpl;

import javax.management.InvalidAttributeValueException;
import java.sql.SQLException;

/**
 * Created by Vasyl_Voloshyn on 5/15/2017.
 */
public class Main {
    public static void main(String args[]) throws InvalidAttributeValueException, SQLException {
    	
    	BunchOfFlowersDao dao = new BunchOfFlowersDaoImpl();
    	BunchOfFlowers bunch = null;
		try{
			bunch = dao.getBunchOfFlowersById(2);
			System.out.println(bunch);
		}catch(SQLException e){
			System.out.println("SQL EXCEPTION "+ e.toString());;
		}
    }

}
