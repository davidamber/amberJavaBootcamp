package com.amberJavaBootcamp.CafeProject;

public class Coffee extends Product {
    @Override
    public double calculateProductTotal() {
        return this.getPrice() * this.getQuantity();
    }

    boolean sugar;
    boolean milk;

    public Coffee() {
        super();
        this.milk = false;
        this.sugar = false;
    }

    public Coffee(boolean sugar, boolean milk, String name,
                  double price, String description) {
        super(name, price, description);
        this.milk = milk;
        this.sugar = sugar;
    }

    public boolean getMilk() {
        return milk;
    }
    public boolean getSugar() {
        return sugar;
    }
    public void setMilk (boolean newMilk) {
        this.milk = milk;
    }
    public void setSugar (boolean newSugar) {
        this.sugar = sugar;
    }

    @Override
    public double calculateProductSubtotal() {
        return  productPrice * productQuantity;
    }

}
