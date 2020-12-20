package cn.com.fanshe;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class ClassTest {


@Test
public  void  tt1 () {
    System.out.println("嗨客网(www.haicoder.net)");
    Class<?> class1 = null;
    Class<?> class2 = null;
    Class<?> class3 = null;
    try {
        class1 = Class.forName("cn.com.fanshe.PersonForClass");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    class2 = new PersonForClass().getClass();
    class3 = PersonForClass.class;

    System.out.println(" Class.forName() 得到的类名称:" + class1.getName());
    System.out.println(" 对象.getClass 得到的类名称:" + class2.getName());
    System.out.println(" 类.class 得到的类名称:" + class3.getName());
}



    @Test
    public  void  tt2 () {
        System.out.println("嗨客网(www.haicoder.net)");

        Class<?> constructClass = null;

        try {
            constructClass = Class.forName("com.haicoder.net.cls.PersonForClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("========无参构造函数开始======");
            PersonForClass personForClass = (PersonForClass) constructClass.newInstance();
            personForClass.setAge(100);
            personForClass.setName("嗨客网");
            System.out.println("无参构造函数打印结果：" + personForClass.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("=============有参构造函数开始===========");
            //获取全部构造方法，构造方法的顺序与代码里面的顺序一致
            Constructor<?> cons[] = constructClass.getConstructors();
            PersonForClass personForClass2 = (PersonForClass) cons[1].newInstance(200, "嗨客网");
            System.out.println("有参构造函数打印结果：" + personForClass2.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public  void  tt3() {
        System.out.println("嗨客网(www.haicoder.net)");
        Class<?> constructClass = null;
        try {
            constructClass = Class.forName("cn.com.fanshe.PersonForClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {

            //获取全部构造方法，构造方法的顺序与代码里面的顺序一致
            Constructor<?> cons[] = constructClass.getConstructors();
            for (int i = 0; i < cons.length; i++) {
                System.out.println("构造方法有：" + cons[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}