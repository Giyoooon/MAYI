package DB.repository;

import DB.entity.Restaurants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantsRepository extends JpaRepository<Restaurants, String> {

}
