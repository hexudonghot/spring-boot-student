import java.awt.*;
// https://haicoder.net/java/java-paradigm.html
public class TestQieMian {
    public static void main(String[] args) {
        QieMian<Integer> point = new QieMian<>();
       point.setValue(100);
       printInfo(point);
    }

//切面通配符
    public static void printInfo(QieMian<? extends  Number> qieMian )
    {
        System.out.println(qieMian.getValue());;
    }
}
