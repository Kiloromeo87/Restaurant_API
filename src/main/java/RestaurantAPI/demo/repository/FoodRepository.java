package RestaurantAPI.demo.repository;

        import RestaurantAPI.demo.entity.Food;
        import org.springframework.data.domain.Page;
        import org.springframework.data.domain.Pageable;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

        import java.util.List;
        import java.util.Optional;

@Repository
public interface FoodRepository extends CrudRepository<Food, Long> {

        @Override
        <S extends Food> S save(S s);

        @Override
        List<Food> findAll();

        @Query("SELECT COUNT(id) FROM VaccinationRegistration")
        long countAll();

        Optional<Food> findFirstByName(String name);

}