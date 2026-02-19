package az.edu.ada.wm2.dependency_injection_example.config;
//@ImportResource("classpath:applicationContext.xml")

import az.edu.ada.wm2.dependency_injection_example.beans.Order;

import az.edu.ada.wm2.dependency_injection_example.beans.Person;
import az.edu.ada.wm2.dependency_injection_example.beans.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfiguration {

//    @Bean
//    public Person personBean() {
//        Person person = new Person();
//        person.setId("PER001");
//        person.setFirstName("John");
//        person.setLastName("Doe");
//        return person;
//    }

//    @Autowired
//    @Qualifier("productBean")
//    private Product defaultProduct;


//    @Bean
//    @Scope("prototype")
//    public Order orderBeanJava(@Qualifier("personBean") Person defaultPerson) {
//        Order order = new Order();
//        order.setId("ORD001");
//        order.setOwner (personBean()); // Inject Person bean
//        order.setProducts (new ArrayList<>(List.of(defaultProduct))); // Inject Product bean
//        order.setTotal(1200.00);
//        return order;
//    }
}
