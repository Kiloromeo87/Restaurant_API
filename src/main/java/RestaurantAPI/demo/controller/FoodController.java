package RestaurantAPI.demo.controller;


import RestaurantAPI.demo.entity.Food;
import RestaurantAPI.demo.exeption.FoodExeption;
import RestaurantAPI.demo.service.FoodService;
import org.apache.tomcat.jni.Address;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/foods")
public class FoodController {

    private static final Logger log = LoggerFactory.getLogger(FoodController.class);

    public FoodController() {
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Food addFood(@RequestBody Food food) {
        log.info("Received addFood request {} ... ", food);
        try {
            Food result = foodService.createFood(food);
            log.debug("Result is: {}", result);
            return result;
        } catch (FoodExeption e) {
            log.error("Error when creating registration: " + e.getMessage());
            throw new ResponseStatusException(e.getHttpStatus(), e.getMessage());
        }
    }

    @PutMapping("/modify")
    public Food updateFood(@RequestBody Food food) {
        log.info("Received Food update request for food{}", food);
//        try {
//            VaccinationRegistration updatedRegistration = vaccinationRegistrationService.updateAddress(registrationId, address);
//            log.debug("The updated registration is: {}", updatedRegistration);
//            return updatedRegistration;
//        } catch (MissingRegistrationException e) {
//            log.error("Registration with given id ({}) not found.", registrationId);
//            throw new ResponseStatusException(e.getHttpStatus(), "Registration with given id not found");
//        }
        return food;
    }

    @GetMapping("/foods")
    public List<Food> getFoods(){
        log.info("Retrieving foods ...");
        List<Food> foodList;
        foodList = FoodService.listFoods();
        log.debug("Found foods: {}", getFoods());
        return foodList;
    }

    @GetMapping("/food/{id}")
    public Food getSingleFood(@PathVariable("id") Long foodId){
        log.info("Retrieving food ...");
        List<Food> foodList;
        food = Food. ////?
        log.debug("Found foods: {}", getFoods());
        return foodList;
    }



}

//    Készítsd el a FoodControllert, legyen a /api/foods pathon és valósítsa meg a következő műveleteket
//        Új létrehozás
//        Módosítás
//        Összes lekérése
//        Lekérés ID alapján (pathban add át az id-t)
