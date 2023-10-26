package jiwoo.Fishing;

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
        return "[" + name + ", " + price + "원]";
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

    public static int makeRandom(int a, int b) {

        return (int)((Math.random() * (b-a+1) )+a);
        // 20,40 = ?
        // (int)((Math.random() * 40-20+1)+20); => 20부터 40까지
        // 17, 17 = ??
        // (int)((Math.random() * 17-17+1)+17); => 17부터 17까지
        // 1, 1100 = ???
        // (int)((Math.random() * 1100 - 1 + 1)+1); => 1부터 1100까지
        // 22, 26 = ?
        // (int)((Math.random() * 26 - 22 + 1)+22); => 22부터 26까지
    }
}
