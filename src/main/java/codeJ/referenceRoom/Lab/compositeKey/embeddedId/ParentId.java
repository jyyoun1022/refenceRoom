package codeJ.referenceRoom.Lab.compositeKey.embeddedId;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
public class ParentId implements Serializable {

    @Column(name = "PARENT_ID3")
    private String id3;

    @Column(name = "PARENT_ID4")
    private String id4;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
