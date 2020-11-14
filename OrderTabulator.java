/*
 * Copyright 2020 codhiker.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ls3_classStructure;

import java.util.Scanner;

/**
 * This program demonstrates Point-Of-Service capability for a restaurant
 * @author matthew
 */
public class OrderTabulator {
    
    // initalize member variables
    private static int numPizzaSlidersOrdered = 0;
    private static int numRoastBeefSlidersOrdered = 0;
    private static int numBuns = 15;
    private static int numCheese = 23;
    private static int numPatties = 12;
    private static int numSauce = 10;
    private static double totalRevenue = 0;
    final static double SALES_TAX_MULTIPLER = 1.07;
    final static double PIZZA_SLIDER_PRICE = 1.99;
    final static double ROAST_BEEF_SLIDER_PRICE = 2.50;
    
    public static void main(String[] args) {
        
        // create a Scanner object
        Scanner scan = new Scanner(System.in);
        
        // prompt user with display and prompt for pizza sliders input
        System.out.println("**********Point-of sales System*********");
        System.out.println("Enter the number of pizza sliders ordered:");
        // store inputted number
        int numPizzaSliders = scan.nextInt();
        // call to orderPizzaSliders
        orderPizzaSliders(numPizzaSliders);
        // prompt user for input for beef sliders
        System.out.println("Enter the number of roast beef sliders ordered:");
        // store inputted number
        int numRoastBeefSliders = scan.nextInt();
        // call to method orderRoastBeefSliders
        orderRoastBeefSliders(numRoastBeefSliders);
        
        // call to displayOrderTotals
        displayOrderTotals();
    } // close method main
    
    public static void orderPizzaSliders(int amount) {
        // increment numPizzaSlidersOrdered by inputted amount
        numPizzaSlidersOrdered = numPizzaSlidersOrdered + amount;
        // see if the order works based on the number of ingrediants
        if (numBuns >= amount && numCheese >= amount && numSauce >= amount) {
            numBuns = numBuns - amount;
            numCheese = numCheese - amount;
            numSauce = numSauce - amount;
            // calculate revenue from purchase and add it to totalRevenue
            totalRevenue = totalRevenue + taxItems(amount, PIZZA_SLIDER_PRICE);
        } else {
            // determine what ingredient is lacking
            int leastAmount = 0;
            if (numBuns < amount) {
                leastAmount = numBuns;
            }
            if (numCheese < amount && numCheese < leastAmount) {
                leastAmount = numCheese;
            }
            if (numSauce < amount && numSauce < leastAmount) {
                leastAmount = numSauce;
            }
            // tell user the greatest amount of orders possible, and make them
            System.out.println("Your order cannot be made because we don't have enough ingredients.");
            System.out.println("The greatest amount of orders made will be " + leastAmount);
            numBuns = numBuns - leastAmount;
            numCheese = numCheese - leastAmount;
            numSauce = numSauce - leastAmount;
            // calculate revenue from purchase and add it to totalRevenue
            totalRevenue = totalRevenue + taxItems(leastAmount, PIZZA_SLIDER_PRICE);
        } // close if / else
    } // close method orderPizzaSliders
    
    public static void orderRoastBeefSliders(int amount) {
        // increment numPizzaSlidersOrdered by inputted amount
        numPizzaSlidersOrdered = numPizzaSlidersOrdered + amount;
        // determine if the order is possible
        if (numBuns >= amount && numCheese >= amount && numPatties >= amount) {
            numBuns = numBuns - amount;
            numCheese = numCheese - amount;
            numPatties = numPatties - amount;
            // calculate revenue from purchase and add it to totalRevenue
            totalRevenue = totalRevenue + taxItems(amount, ROAST_BEEF_SLIDER_PRICE);
        } else {
            // determine what ingredient is lacking this time
            int leastAmount = 0;
            if (numBuns < amount) {
                leastAmount = numBuns;
            }
            if (numCheese < amount && numCheese < leastAmount) {
                leastAmount = numCheese;
            }
            if (numPatties < amount && numPatties < leastAmount) {
                leastAmount = numPatties;
            }
            // tell user the greatest amount of orders possible, and make them
            System.out.println("Your order cannot be made because we do not have the ingredients.");
            System.out.println("The greatest amount of orders made will be " + leastAmount);
            numBuns = numBuns - leastAmount;
            numCheese = numCheese - leastAmount;
            numPatties = numPatties - leastAmount;
            // calculate revenue from purchase and add it to totalRevenue
            totalRevenue = totalRevenue + taxItems(leastAmount, ROAST_BEEF_SLIDER_PRICE);
        } // close if / else
    } // close method orderRoastBeefSliders
    
    public static void displayOrderTotals() {
        // display statistics about orders
        System.out.println("*********Total Orders********");
        System.out.println("Pizza sliders ordered: " + numPizzaSlidersOrdered);
        System.out.println("Roast beef sliders ordered: " + numRoastBeefSlidersOrdered);
        System.out.println("Total revenue: " + totalRevenue);
        System.out.println("********Inventory Tracking*********");
        System.out.println("Buns remaining: " + numBuns);
        System.out.println("Cheese remaining: " + numCheese);
        System.out.println("Meat remaining: " + numPatties);
        System.out.println("Sauce remaining: " + numSauce);
    } // close method orderRoastBeefSliders
    
    public static double taxItems(int items, double price) {
        // multiply items by price
        double subtotal = (double) items * price;
        // multiply subtotal by tax multiplier, and return it
        return subtotal * SALES_TAX_MULTIPLER;
    } // close method taxItems
    
} // close class OrderTabulator