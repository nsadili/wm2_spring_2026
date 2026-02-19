package az.edu.ada.wm2.dependency_injection_example;

import az.edu.ada.wm2.dependency_injection_example.beans.Product;
import az.edu.ada.wm2.dependency_injection_example.beans.Order;
import az.edu.ada.wm2.dependency_injection_example.beans.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DependencyInjectionExampleApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DependencyInjectionExampleApplication.class, args);
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Product product = (Product) context.getBean("productBean", Product.class);
//
//        System.out.println(product);

        ApplicationContext context =
                SpringApplication.run(DependencyInjectionExampleApplication.class, args);


        var order1 = context.getBean(Order.class);
        var order2 = context.getBean(Order.class);

        System.out.println(order1);
        System.out.println(order2);

//        Product product2 = context.getBean("productBean", Product.class);
//
//        System.out.println(product2);
//
        System.out.println(order1 == order2);



    }

}
