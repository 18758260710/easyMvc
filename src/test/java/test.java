import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by admin on 2018/8/8.
 */
public class test {

    public static void main(String[] args) {
        try {
            Class clazz=Class.forName("com.easyMVC.controller.TestController");
            Method[] methods = clazz.getDeclaredMethods();
            System.out.println(methods.length);
            Method method=methods[0];
            Parameter[] parameter = method.getParameters();
            String param = parameter[0].getName();
            System.out.println(param);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
