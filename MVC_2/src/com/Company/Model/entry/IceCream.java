package com.Company.Model.entry;

public class IceCream {
    private String name;
    private int stock;
    private int price;

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public IceCream(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
}
