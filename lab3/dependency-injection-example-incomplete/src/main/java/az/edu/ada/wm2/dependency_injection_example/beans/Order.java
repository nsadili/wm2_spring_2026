package az.edu.ada.wm2.dependency_injection_example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class Order {

    @Value("ORD000")
    private String id;

    private final Person owner;          // constructor injected
    private List<Product> products;      // setter injected

    @Value("0.0")
    private Double total;

    // ✅ owner via constructor
    @Autowired
    public Order(Person owner) {
        this.owner = owner;
    }
    // ✅ products via setter
    @Autowired
    public void setProducts(List<Product> products) {
        this.products = products;
    }


//    private String id;
//
//    @Autowired
//    private Person owner;
//
//    @Autowired
//    private List<Product> products;
//
//    private Double total;

//    public Order() { }
//
//    public Order(String id, Person owner, List<Product> products, Double total) {
//        this.id = id;
//        this.owner = owner;
//        this.products = products;
//        this.total = total;
//    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Person getOwner() { return owner; }
//    public void setOwner(Person owner) { this.owner = owner; }

    public List<Product> getProducts() { return products; }
//    public void setProducts(List<Product> products) { this.products = products; }

    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", owner=" + owner +
                ", products=" + products +
                ", total=" + total +
                '}';
    }
}
