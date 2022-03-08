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
        setMilk(milk);
        setSugar(sugar);
    }

    public boolean getMilk() {
        return milk;
    }
    public boolean getSugar() {
        return sugar;
    }
    public void setMilk (boolean newMilk) {
        this.milk = newMilk;
    }
    public void setSugar (boolean newSugar) {
        this.sugar = newSugar;
    }

}
