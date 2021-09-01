package com.company;

public class Coins {
    private int quantityOnHand;
    private float denomination;
    private float weight;

    public Coins(float denomination, float weight) {
        this.denomination = denomination;
        this.weight = weight;
    }

    public float getTotalWeight() { return weight * quantityOnHand; }
    public float getTotalValue() { return denomination * quantityOnHand; }
    public int getQuantityOnHand() { return quantityOnHand; }
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

    @Override
    public String toString() {
        return (String.format("$" + String.format("%.2f", getTotalValue()) + " in $" + denomination + " coins."));
    }
}

