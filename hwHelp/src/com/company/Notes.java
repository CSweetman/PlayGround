package com.company;

public class Notes {
    private int quantityOnHand;
    private float denomination;

    public Notes(int denomination) {
        this.denomination = denomination;
    }

    public float getTotalValue() {
        return denomination * quantityOnHand;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void increaseQuantity(int amount) {
        quantityOnHand += amount;
    }

    public void decreaseQuantity(int amount) {
        quantityOnHand -= amount;
        if (quantityOnHand <= 0)
            quantityOnHand = 0;
    }

    public String printPretty(float amount) {
        return("$" + String.format("%4.2f", amount));
    }

    public String toString() {
        return (String.format("$" + getTotalValue() + " in $" + denomination + " notes."));
    }
}
