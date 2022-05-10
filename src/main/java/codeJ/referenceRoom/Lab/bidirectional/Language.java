package codeJ.referenceRoom.Lab.bidirectional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lno;


    @Column(nullable = false)
    private LanguageType languageType;

    @ManyToOne(fetch = FetchType.LAZY)
    private Board board;

    public void setBoard(Board board) {
        this.board = board;
    }
}
