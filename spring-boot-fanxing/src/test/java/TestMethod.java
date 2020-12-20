public class TestMethod {
    public static void main(String[] args) {
        System.out.println("嗨客网(www.haicoder.net)");

        MethodClass methodClass = new MethodClass();

        String retValue = methodClass.getInfo("嗨客网");
        System.out.println("传递的参数是String类型 : " + retValue);

        Integer intValue = methodClass.getInfo(12);
        System.out.println("传递的参数是Integer类型 : " + intValue);

        System.out.println("结束");
    }
}
