package com.flowerShop.view;

/**
 * Created by Vasyl_Voloshyn on 5/16/2017.
 */
public class View {
    public static final String INPUT = "Input value = ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please!";
    public static final String CHOSE_NUM_OF_FLOWERS = "Chose num of flowers in bunch";
    public static final String CHOSE_LENGTH_OF_STALK = "Chose length of stalk";
    public static final String CHOSE_PRICE_OF_ONE_FLOWER = "Chose price of one flower in bunch";
    public static final String CHOSE_FLOWER_NAME = "Chose name of flowers";
    public static final String ADD_FLOWERS = "Add some flowers to your bouquet";
    public static final String SOLD = "This is yours. Take it please. Your bouquet is: ";
    public static final String CHOSE_BOUQUET = "Chose bouquet that you want to buy by index";
    public static final String BOUQUETS = "Bouquets that we have now:\n";
    public static final String CHOSE_ROLE = "Chose role of bunch in bouquet";
    public static final String CHOSE_FRESH_LEVEL = "Chose freshness of bunch in bouquet";

    public void printMessage(String message){
        System.out.println(message);
    }
}
