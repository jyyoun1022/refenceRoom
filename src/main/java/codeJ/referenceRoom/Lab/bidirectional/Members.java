package codeJ.referenceRoom.Lab.bidirectional;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class Members {

    @Id
    private String member_id;

    private String nickName;

    private String password;

    private String email;
}
