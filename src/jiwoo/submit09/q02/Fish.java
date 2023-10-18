package jiwoo.submit09.q02;

public class Fish {
    String name;
    int price;


    public Fish (String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + name +
                ", 가치: " + price +
                ']';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
