package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());


ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat cat =  context.getBean("cat", Cat.class);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());

        Cat cat1 = context.getBean("cat", Cat.class);
        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());

        Boolean comparison = cat.equals(cat1);
        System.out.println("comparison = " + comparison);


    }
}
