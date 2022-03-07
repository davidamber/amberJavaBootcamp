package com.amberJavaBootcamp.CafeProject;

public class Espresso extends Product {
    @Override
    public double calculateProductTotal() {
        return this.getPrice() * this.getQuantity() {
            if (extraShot = true) {
                System.out.println(calculateProductTotal() + 2);
            } else {
                System.out.println(calculateProductTotal());
            }
        }
    }
    boolean extraShot;
    boolean macchiato;

    public Espresso() {
        super();
        this.extraShot = true;
        this.macchiato = true;
    }

    public Espresso(boolean extraShot, boolean macchiato, String name,
                  double price, String description) {
        super(name, price, description);
        this.extraShot = extraShot;
        this.macchiato = macchiato;
    }

    public boolean getExtraShot() {
        return extraShot;
    }
    public boolean getMacchiato() {
        return macchiato;
    }
    public void setExtraShot (boolean newExtraShot) {
        this.extraShot = extraShot;
    }
    public void setSugar (boolean newMacchiato) {
        this.macchiato = macchiato;
    }
}
