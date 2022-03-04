package com.amberJavaBootcamp.CafeProject;

import java.util.Scanner;

public class CafeApp {
    public static void main(String[] args) {
        Product coffee = new Product();
        Product espresso = new Product();
        Product cappuccino = new Product();

        coffee.setName("Coffee");
        coffee.setPrice(2.99);
        coffee.setDescription("House roast black coffee");

        espresso.setName("Espresso");
        espresso.setPrice(3.99);
        espresso.setDescription("Rich and flavorful shot of espresso");

        cappuccino.setName("Cappuccino");
        cappuccino.setPrice(4.99);
        cappuccino.setDescription("Creamy mixture of milk and a shot of espresso");

        Scanner drinkOrder = new Scanner(System.in);
        System.out.println("How many " + coffee.getName() + "s" + " do you want?");
        int drinkInput = drinkOrder.nextInt();
        coffee.setQuantity(drinkInput);
        double subtotal = coffee.calculateProductTotal();
        System.out.println("Subtotal: " + subtotal);

        System.out.println("How many " + espresso.getName() + "s" + " do you want?");
        drinkOrder.nextInt();
        espresso.setQuantity(drinkInput);
        System.out.println("Subtotal: " + subtotal);

        System.out.println("How many " + cappuccino.getName() + "s" + " do you want?");
        drinkOrder.nextInt();
        cappuccino.setQuantity(drinkInput);
        System.out.println("Subtotal: " + subtotal);

        double subTotal = (coffee.calculateProductTotal() + espresso.calculateProductTotal() + cappuccino.calculateProductTotal());
        double salesTax = 0.015;
        double saleTotal = ((subTotal * salesTax) + subTotal);
        System.out.println("\nSale Subtotal: " + subTotal);
        System.out.println("Sales Tax: " + salesTax);
        System.out.println("Sales Total: " + saleTotal);

//        System.out.println(coffee.getPrice());
//        System.out.println(coffee.getDescription());
//
//        System.out.println(espresso.getPrice());
//        System.out.println(espresso.getDescription());
//
//        System.out.println(cappuccino.getPrice());
//        System.out.println(cappuccino.getDescription());
    }


}