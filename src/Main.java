import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Tester tester = new Tester();
        Class<?> cls = tester.getClass();
        for(Method m : cls.getDeclaredMethods()) {
            if(m.isAnnotationPresent(Test.class)){
                Test annotation = m.getAnnotation(Test.class);
                int param1 = annotation.param1();
                int param2 = annotation.param2();
                m.invoke(tester, param1, param2);
            }

        }
    }
}