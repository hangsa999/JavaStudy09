package jiwoo.submit11.q01;

public class CartoonBoard extends Board {
    private String img;

    public CartoonBoard(int num, String title, String date, String detail, String img) {
        super(num, title, date, detail);
        this.img = img;
    }

    @Override
    public String toString() {
        return "CartoonBoard{" +
                "num=" + getNum() +
                ", title='" + getTitle() + '\'' +
                ", date='" + getDate() + '\'' +
                ", detail='" + getDetail() + '\'' +
                ", img='" + img + '\'' +
                '}';
    }


    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
