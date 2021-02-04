package RestaurantAPI.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String id;

    private String email;
    private String fullAddress;

}
