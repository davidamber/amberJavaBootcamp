package com.amberJavaBootcamp.CafeProject;

import java.util.Scanner;

public class CafeApp {
    public static void main(String[] args) {
        Product cof1 = new Coffee();
        Product esp1 = new Espresso();
        Product capp1 = new Cappuccino();

        cof1.setName("Coffee");
        cof1.setPrice(2.99);
        cof1.setDescription("House roast black coffee");

        esp1.setName("Espresso");
        esp1.setPrice(3.99);
        esp1.setDescription("Rich and flavorful shot of espresso");

        capp1.setName("Cappuccino");
        capp1.setPrice(4.99);
        capp1.setDescription("Creamy mixture of milk and a shot of espresso");

        Scanner drinkOrder = new Scanner(System.in);
        System.out.println("How many " + cof1.getName() + "s" + " do you want?");
        int drinkInput = drinkOrder.nextInt();
        cof1.setQuantity(drinkInput);
        double subtotal = cof1.calculateProductTotal();
        System.out.println("Subtotal: " + subtotal);

        System.out.println("How many " + esp1.getName() + "s" + " do you want?");
        drinkOrder.nextInt();
        esp1.setQuantity(drinkInput);
        System.out.println("Subtotal: " + subtotal);

        System.out.println("Do you want a shot of espresso ?");
        boolean shotChoice;
        if(drinkOrder.next() == "n"){
            shotChoice = false;
        }else {
            shotChoice = true;
        }

        //scanner to read in customer choice
        //boolean to call 5 param constructor
        //drinkOrder.nextBoolean();
        //esp1.setQuantity(drinkInput);

        //System.out.println("Subtotal: " + subtotal);

        System.out.println("Do you want to make it a macchiato?");
        boolean maccChoice;
        if(drinkOrder.next() == "n"){
            maccChoice = false;
        }else {
            maccChoice = true;
        }
        drinkOrder.nextBoolean();
        esp1.setQuantity(drinkInput);
        esp1 = new Espresso(shotChoice, maccChoice, esp1.getName(), esp1.getPrice(), esp1.getDescription()) ;
       //end of additions
        System.out.println("Subtotal: " + subtotal);

        System.out.println("How many " + capp1.getName() + "s" + " do you want?");
        drinkOrder.nextInt();
        capp1.setQuantity(drinkInput);
        System.out.println("Subtotal: " + subtotal);

        double subTotal = (cof1.calculateProductTotal() + esp1.calculateProductTotal() + capp1.calculateProductTotal());
        double salesTax = 0.015;
        double saleTotal = ((subTotal * salesTax) + subTotal);
        System.out.println("\nSale Subtotal: " + subTotal);
        System.out.println("Sales Tax: " + salesTax);
        System.out.println("Sales Total: " + saleTotal);

        System.out.println(cof1.getPrice());
        System.out.println(cof1.getDescription());

        System.out.println(esp1.getPrice());
        System.out.println(esp1.getDescription());

        System.out.println(capp1.getPrice());
        System.out.println(capp1.getDescription());
    }


}