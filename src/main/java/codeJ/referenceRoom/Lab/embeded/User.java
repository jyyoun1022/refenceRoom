package codeJ.referenceRoom.Lab.embeded;

import javax.persistence.*;

@Entity
@Table( name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "user_id")
    private Long id;

    private String name;

    private String phoneNum;

    @Embedded
    private Address address;


}
