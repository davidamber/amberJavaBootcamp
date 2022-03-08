package com.amberJavaBootcamp.CafeProject;

public class Espresso extends Product {
    public boolean extraShot;
    private boolean macchiato;



    public Espresso() {
        super();
        this.extraShot = true;
        this.macchiato = true;
    }

    public Espresso(boolean extraShot, boolean macchiato, String name,
                    double price, String description) {
        super(name, price, description);
        setExtraShot(extraShot);
        setMacchiato(macchiato);
    }

    public boolean setExtraShot(boolean newShot){
     return this.extraShot = newShot;
    }

    public boolean setMacchiato(boolean newMacc){
        return this.extraShot = newMacc;
    }

    public boolean getExtraShot(String choice) {
        if (choice.equalsIgnoreCase("n")){
            extraShot = false;
        }else {
            extraShot = true;
        }
        return extraShot;
    }
    public boolean getMacchiato() {
        return macchiato;
    }
    @Override
    public double calculateProductTotal() {

        if (extraShot = true) {
            System.out.println(calculateProductTotal() + 2);
        } else {
            System.out.println(calculateProductTotal());
        }
        return this.getPrice() * this.getQuantity();
    }
}
