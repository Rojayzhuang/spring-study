import com.rojay.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Rojay
 * @version 1.0.0
 * @createTime 2020年12月18日  15:17:32
 */
public class MyTest {
    //获取Spring的上下文对象
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //现在的对象都在Spring中管理，要使用直接去里面取出来即可
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }


}
