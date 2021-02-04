package RestaurantAPI.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantApiApplication {
//something
	public static void main(String[] args) {
		SpringApplication.run(RestaurantApiApplication.class, args);
	}

}

//	Készítsd el a következő entitásokat:
//		Food(String id; String name; String description; Double price, @JsonIgnore List<Order> orders)
//		User(String id; String email; String fullAddress)
//		Order(String id; List<Food> foods; User orderedBy)
//		A Food és az Order között több a többhöz kapcsolat áll fenn, mivel egy étel több rendeléshez is tarozhat, de egy rendelésben több étel is szerepelhet.
//		Készíts repository-kat az entitásokhoz.
