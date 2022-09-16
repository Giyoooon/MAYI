package DB.entity;


import javax.persistence.*;

@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column
    private String user_name;

    /**
     * reservation_id(fk) 이거 맞나?
     */
}
