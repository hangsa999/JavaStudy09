package jiwoo.submit11.q01;

public class Board {

    // 필드 변수: 글 번호, 글 제목, 글 게시일(String), 글 내용
    private int num;
    private String title;
    private String date;
    private String detail;

    public Board() {
    }

    public Board(int num, String title, String date, String detail) {
        this.num = num;
        this.title = title;
        this.date = date;
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "[" + num + ". | " + title + " | " + date + "]";
    }




    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
