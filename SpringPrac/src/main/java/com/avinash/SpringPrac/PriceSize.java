package com.avinash.SpringPrac;
public class PriceSize
{
    private int price;
    private String size;

    public PriceSize(int price, String size) {
        this.price = price;
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

