package Model.entery;

public class CarEntiBuilder {
    private String name;
    private int price;
    private int stock;

    public CarEntiBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CarEntiBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public CarEntiBuilder setStock(int stock) {
        this.stock = stock;
        return this;
    }

    public CarEnti createCarEnti() {
        return new CarEnti(name, price, stock);
    }
}