package RestaurantAPI.demo.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Order {

    private String id;

    @ManyToMany
    @JoinTable(
            name = "order_taken",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "food_id"))
    private List<Food> foods;



}

    //Order(String id;List<Food>foods; User orderedBy)
