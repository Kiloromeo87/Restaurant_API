package RestaurantAPI.demo.entity;

import RestaurantAPI.demo.controller.FoodController;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Food {

    private static final Logger log = LoggerFactory.getLogger(FoodController.class);


    @Id
    private String id;

    private String name;
    private String description;
    private Double price;

    @JsonIgnore
    @ManyToMany (mappedBy = "takenOrders")
    private List<Order> orders;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}


//    Food(String id; String name; String description; Double price, @JsonIgnore List<Order> orders)