package cn.com.fanxing;

public class MethodClass {
    public<T> T getInfo(T t){
        System.out.println("调用了抽象方法");
        return t;
    }
}
