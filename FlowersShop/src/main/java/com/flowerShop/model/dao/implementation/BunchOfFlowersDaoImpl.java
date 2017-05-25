package com.flowerShop.model.dao.implementation;

import com.flowerShop.model.dao.BunchOfFlowersDao;
import com.flowerShop.model.flowers.BunchOfFlowers;
import com.flowerShop.model.flowers.BunchOfFlowersBuilder;
import com.flowerShop.model.connection.MySQLConnection;

import java.sql.*;
import com.flowerShop.model.flowers.*;
/**
 * Created by Vasyl_Voloshyn on 5/23/2017.
 */
public class BunchOfFlowersDaoImpl implements BunchOfFlowersDao {

    public BunchOfFlowers getBunchOfFlowersById(int id) throws SQLException{
        Connection connection = MySQLConnection.getConnection();
        Statement statement = null;
        BunchOfFlowersBuilder builder = new BunchOfFlowersBuilder();
        String query = "SELECT * FROM bunchofflowers WHERE id = "+id;
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while(rs.next()){
                builder.buildName(rs.getString("name")).
                buildFreshness(Freshness.valueOf(rs.getString("freshness"))).
                buildPrice(rs.getDouble("price")).
                buildLengthOfStalk(rs.getInt("lengthOfStalk")).
                buildNumOfFlowersInBunch(rs.getInt("numOfFlowersInBunch"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            if (statement != null) { statement.close(); }
        }
        return builder.build();
    }

    public void createBunchOfFlowers(String id, String name, String freshness, String price, String lengthOfStalk, String numOfFlowersInBrunch) throws SQLException {
        String query = "INSERT INTO bunchofflowers VALUES(?, ?, ?, ?, ?, ?)";
            Connection connection = MySQLConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, Integer.parseInt(id));
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, freshness);
            preparedStatement.setDouble(4, Double.parseDouble(price));
            preparedStatement.setInt(5, Integer.parseInt(lengthOfStalk));
            preparedStatement.setInt(6, Integer.parseInt(numOfFlowersInBrunch));
            preparedStatement.executeUpdate();
            preparedStatement.close();        
    }

    public void updateBunchOfFlowers(int id, String name, Freshness freshness, double price, int lengthOfStalk, int numOfFlowersInBrunch){
        String query = "UPDATE bunchofflowers SET name = ?, freshness = ?, price = ?, lengthOfStalk = ?, numOfFlowersInBrunch = ? WHERE id = ?";
        try {
            Connection connection = MySQLConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2, freshness.toString());
            preparedStatement.setDouble(3, price);
            preparedStatement.setInt(4, lengthOfStalk);
            preparedStatement.setInt(5, numOfFlowersInBrunch);
            preparedStatement.setInt(6, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBunchOfFlowers(int id) {
        String query = "DELETE FROM bunchofflowers WHERE id = ?";
        try {
            Connection connection = MySQLConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

