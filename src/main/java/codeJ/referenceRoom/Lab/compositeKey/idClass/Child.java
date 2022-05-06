package codeJ.referenceRoom.Lab.compositeKey.idClass;

import javax.persistence.*;

@Entity
public class Child {

    @Id
    private String id;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PARENT_ID1",referencedColumnName = "PARENT_ID1"),
            @JoinColumn(name = "PARENT_ID2",referencedColumnName = "PARENT_ID2")
    })
    private Parent parent;
    //name과 referencedColumnName이 같다면 referencedColumnName은 생략이 가능하다
}
