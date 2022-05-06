package codeJ.referenceRoom.Lab.compositeKey.idClass;

import javax.persistence.Entity;
import java.io.Serializable;

//식별자 클래스
public class ParentId implements Serializable {

    private String id1; //Parent.id1 매핑
    private String id2; //Parent.id2 매핑

    public ParentId(String id1, String id2) {
        this.id1 = id1;
        this.id2 = id2;
    }

    public ParentId() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
