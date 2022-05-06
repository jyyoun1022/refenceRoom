package codeJ.referenceRoom.Lab.compositeKey.embeddedId;

import javax.persistence.*;

@Entity
public class Child2 {

    @Id
    private String id;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PARENT_ID3",referencedColumnName = "PARENT_ID3"),
            @JoinColumn(name = "PARENT_ID4",referencedColumnName = "PARENT_ID4")
    })
    private Parent2 parent2;

}
