package DB.entity;

import javax.persistence.*;

@Entity
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column
    private int reservation_time;

    @Column
    private String headcount;

    /**
     * userId (fk)
     * restaurantsId (fk)
     * */
}
