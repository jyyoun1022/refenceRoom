package codeJ.referenceRoom.Lab.compositeKey.exercise;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "product")
    private List<MemberProduct> members = new ArrayList<>();


}
