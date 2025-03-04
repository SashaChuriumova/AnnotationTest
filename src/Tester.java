import java.lang.reflect.Method;

public class Tester {
    @Test(param1 = 2, param2 = 5)
    public void test(int a, int b) {
        System.out.println("Result: " + (a + b));
    }
}
