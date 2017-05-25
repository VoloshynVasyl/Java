package com.flowerShop.controller;

import com.flowerShop.model.Bouquet;
import com.flowerShop.model.BouquetBuilder;
import com.flowerShop.model.ShopWindow;
import com.flowerShop.model.accessories.Wrapper;
import com.flowerShop.model.accessories.WrapperType;
import com.flowerShop.model.flowers.BunchOfFlowers;
import com.flowerShop.model.flowers.BunchOfFlowersBuilder;
import com.flowerShop.model.flowers.Freshness;
import com.flowerShop.model.flowers.Role;
import com.flowerShop.view.View;

import javax.management.InvalidAttributeValueException;
import java.util.Scanner;

/**
 * Created by Vasyl_Voloshyn on 5/16/2017.
 */
public class Controller {
    View view;
    ShopWindow voloshynShop;
    Scanner sc;
    public void processUser() throws InvalidAttributeValueException{
        view = new View();
        voloshynShop = makeFlowerShopWithShopWindow();
        sc = new Scanner(System.in);

        buyBouquet(sc, voloshynShop);

        BunchOfFlowers bunch = makeNewBunchOfFlowers(sc, voloshynShop);
    }

    private void buyBouquet(Scanner scanner, ShopWindow shop){
        view.printMessage(View.BOUQUETS+shop);
        view.printMessage(View.CHOSE_BOUQUET);
        int index = inputIntValueWithScanner(scanner);
        Bouquet soldBouquet = shop.getBouquetFromShopWindowByIndex(index);
        view.printMessage(View.SOLD+" "+ soldBouquet);
    }

    private BunchOfFlowers makeNewBunchOfFlowers(Scanner scanner, ShopWindow shop){
        view.printMessage(View.BOUQUETS+shop);
        view.printMessage(View.ADD_FLOWERS);
        BunchOfFlowersBuilder bunchBuilder = new BunchOfFlowersBuilder();
        view.printMessage(View.CHOSE_FLOWER_NAME);
        bunchBuilder.buildName(inputStringValueWithScanner(scanner));
        view.printMessage(View.CHOSE_PRICE_OF_ONE_FLOWER);
        bunchBuilder.buildPrice(inputDoubleValueWithScanner(scanner));
        view.printMessage(View.CHOSE_FRESH_LEVEL);
        bunchBuilder.buildFreshness(Freshness.valueOf(inputStringValueWithScanner(scanner)));
        view.printMessage(View.CHOSE_LENGTH_OF_STALK);
        bunchBuilder.buildLengthOfStalk(inputIntValueWithScanner(scanner));
        view.printMessage(View.CHOSE_NUM_OF_FLOWERS);
        bunchBuilder.buildNumOfFlowersInBunch(inputIntValueWithScanner(scanner));
        view.printMessage(View.CHOSE_ROLE);
        bunchBuilder.buildRole(Role.valueOf(inputStringValueWithScanner(scanner)));

        return bunchBuilder.build();
    }

    private int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT);
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    private double inputDoubleValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT);
        while( ! sc.hasNextDouble()) {
            view.printMessage(View.WRONG_INPUT_DATA);
            sc.next();
        }
        return sc.nextDouble();
    }

    private String inputStringValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT);
        while( ! sc.hasNext()) {
            view.printMessage(View.WRONG_INPUT_DATA);
            sc.next();
        }
        return sc.next();
    }

    private ShopWindow makeFlowerShopWithShopWindow() throws InvalidAttributeValueException{
        ShopWindow shopWindow = new ShopWindow();
        shopWindow.addBouquetToShopWindow(
                new BouquetBuilder()
                        .addElemToBouquet(
                                new BunchOfFlowers(
                                        "Rose",
                                        25.0,
                                        Freshness.FRESH,
                                        40,
                                        11
                                )
                                , Role.MAIN
                        )
                        .addElemToBouquet(
                                new Wrapper(
                                        "Red paper",
                                        WrapperType.PAPER,
                                        10.0
                                )
                                , Role.SECONDARY
                        )
                        .build("Amazing")
        );

        shopWindow.addBouquetToShopWindow(
                new BouquetBuilder()
                        .addElemToBouquet(
                                new BunchOfFlowers(
                                        "CornFlower",
                                        15.0,
                                        Freshness.FRESH,
                                        40,
                                        11
                                )
                                , Role.MAIN
                        )
                        .addElemToBouquet(
                                new Wrapper(
                                        "Red paper",
                                        WrapperType.PAPER,
                                        10.0
                                )
                                , Role.ATTACHMENT
                        )
                        .addElemToBouquet(
                                new BunchOfFlowers(
                                        "Leaves",
                                        5.0,
                                        Freshness.FRESH,
                                        40,
                                        7
                                )
                                , Role.SECONDARY
                        )
                        .build("Gorgeous")
        );

        return shopWindow;
    }
}

