package RestaurantAPI.demo.repository;

        import org.apache.tomcat.jni.Address;
        import org.apache.tomcat.jni.User;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}


