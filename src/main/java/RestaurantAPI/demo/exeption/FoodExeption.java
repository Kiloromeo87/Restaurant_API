package RestaurantAPI.demo.exeption;

import org.springframework.http.HttpStatus;

public class FoodExeption extends Exception {

    private HttpStatus httpStatus;

    public FoodExeption(String message) {
        this(message, HttpStatus.BAD_REQUEST);
    }

    public FoodExeption(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}

