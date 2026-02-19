package az.edu.ada.wm2.dependency_injection_example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Product {
    @Value("PRD000")
    private String id;

    @Value("DefaultProduct")
    private String name;

    @Value("0.0")
    private Double price;

    @Autowired(required = false)
    private List<Product> products;

    public Product() {}
//    private String id;
//    private String name;
//    private Double price;
//
//    public Product() {
//    }

    public Product(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
