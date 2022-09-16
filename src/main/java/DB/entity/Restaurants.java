package DB.entity;

import javax.persistence.*;

@Entity
@Table(name="restaurants")
public class Restaurants {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column
    private String restaurant_name;

    @Column
    private String kind;

    @Column
    private String location;

    @Column
    private int max_chair;

    @Column
    private String start_time;

    @Column
    private String closed_time;

}
