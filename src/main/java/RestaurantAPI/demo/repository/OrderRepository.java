package RestaurantAPI.demo.repository;

import RestaurantAPI.demo.entity.Food;
import RestaurantAPI.demo.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends CrudRepository<Food, Long> {

    @Override
    <S extends Order> S save(S s);

    @Override
    List<Order> findAll();

    @Query("SELECT COUNT(id) FROM Order")
    long countAll();

    Optional<Order> findFirstById(String id);

}
