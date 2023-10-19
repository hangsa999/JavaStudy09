package jiwoo.submit11;

public class Fish {
    String name;
    int price;
    String field;

    public Fish() {
    }

    public Fish(String name, int price, String field) {
        this.name = name;
        this.price = price;
        this.field = field;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", field='" + field + '\'' +
                '}';
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
