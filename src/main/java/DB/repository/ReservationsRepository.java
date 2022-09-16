package DB.repository;

import DB.entity.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationsRepository extends JpaRepository<Reservations, String> {

}
