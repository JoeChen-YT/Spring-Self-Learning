package joe.experiment.spring.basic;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {

    @Test
    public void testBasicSpringIOCBehavior() {
        final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        final HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("hello_world");
        helloWorld.sayHello();
    }
}
