package ch10_extends_interface.mysort;

public interface MyComparator<T> {

    // MyComparator 를 소환할 때 T에 입력한 객체가
    // 메소드의 T에 적용된다.
    public boolean mycompare(T a, T b);

}
