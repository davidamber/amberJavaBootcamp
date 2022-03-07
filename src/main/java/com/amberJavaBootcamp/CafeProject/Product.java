package com.amberJavaBootcamp.CafeProject;


public abstract class Product {
    private String name;
    private double price;
    private String description;
    private int quantity;

    public Product() {
        this.name = "";
        this.price = 0.00;
        this.description = "";
        this.quantity = 0;
    }

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = 0;
    }

    // getters and setters
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    public void setDescription(String newDescription) {
        this.description = newDescription;
    }
    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public abstract double calculateProductTotal();
        // calculate product subtotal for the order (price * quantity)
        // return this.price * this.quantity;

        }


