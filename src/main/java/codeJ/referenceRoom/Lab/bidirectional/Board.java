package codeJ.referenceRoom.Lab.bidirectional;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = {"languageList","memberId"})
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column(length = 30, nullable = false)
    private String title;

    @Column(nullable = false,columnDefinition = "blob")
    private String content;

    @Column
    private Long viewCount;
    @Column
    private Long likeCount;

    @Column(nullable = false, columnDefinition = "char")
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    private Members memberId;

    @Builder.Default
    @OneToMany(fetch = FetchType.LAZY)
    private List<Language> languageList = new ArrayList<>();
    //mappedBy 속성을 이용하여 하위 엔티티를 이용하여 설정
}
