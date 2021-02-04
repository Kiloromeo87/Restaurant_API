package RestaurantAPI.demo.controller;

import RestaurantAPI.demo.entity.Food;
import RestaurantAPI.demo.entity.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(FoodController.class);

    public OrderController() {
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Order addOrder(@RequestBody Order order) {
        log.info("Received addOrder request {} ... ", order);
//        try {
//            VaccinationRegistration result = vaccinationRegistrationService.createRegistration(vaccinationRegistration);
//            log.debug("Result is: {}", result);
//            return result;
//        } catch (VaccinationRegistrationException e) {
//            log.error("Error when creating registration: " + e.getMessage());
//            throw new ResponseStatusException(e.getHttpStatus(), e.getMessage());
//        }
//    }
        return order;
    }

    @GetMapping("/orders")
    public List<Order> getOrders(){
        log.info("Retrieving oderss ...");
        List<Order> orderList;
        orderList = OrderService.listOrders();
        log.debug("Found foods: {}", getOrders());
        return orderList;
    }

    @GetMapping("/order/{id}")
    public Food getSingleOrder(@PathVariable("id") Long orderId){
        log.info("Retrieving order ...");
        List<Order> orderList;
        order = Food. ////?
                log.debug("Found orders: {}", getOrders());
        return orderList;
    }

}


//    Új létrehozás
//        Összes lekérése
//        Lekérés ID alapján (pathban add át az id-t)
