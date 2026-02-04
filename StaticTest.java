public class StaticTest {
    static int staticVal = 10;
    int instanceVal = 20;

    public static void main(String[] args) {
        System.out.println(staticVal);
        StaticTest obj = new StaticTest();
        System.out.println(obj.instanceVal);
    }
}