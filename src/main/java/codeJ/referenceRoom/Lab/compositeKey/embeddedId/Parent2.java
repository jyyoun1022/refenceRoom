package codeJ.referenceRoom.Lab.compositeKey.embeddedId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Parent2 {

    @EmbeddedId
    private ParentId id;

    private String name;

}
