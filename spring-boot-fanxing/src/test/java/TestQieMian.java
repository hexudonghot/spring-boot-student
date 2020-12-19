import java.awt.*;

public class TestQieMian {
    public static void main(String[] args) {
        QieMian<String> point = new QieMian<>();
       point.setValue("aaaaaaaaaaa");
       printInfo(point);
    }

//切面通配符
    public static void printInfo(QieMian<?> qieMian )
    {
        System.out.println(qieMian.getValue());;
    }
}
