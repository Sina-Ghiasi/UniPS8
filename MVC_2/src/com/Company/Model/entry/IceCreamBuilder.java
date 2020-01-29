package com.Company.Model.entry;

public class IceCreamBuilder {
    private String name;
    private int stock;
    private int price;

    public IceCreamBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public IceCreamBuilder setStock(int stock) {
        this.stock = stock;
        return this;
    }

    public IceCreamBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public IceCream createIceCream() {
        return new IceCream(name, stock, price);
    }
}