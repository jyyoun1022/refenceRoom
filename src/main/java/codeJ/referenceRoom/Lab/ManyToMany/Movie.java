package codeJ.referenceRoom.Lab.ManyToMany;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "posterList")
@Table( name ="tbl_movie")
public class Movie extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    private String  title;


    @Builder.Default
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "movie",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Poster> posterList = new ArrayList<>();
    //여기서 @OneToMany는 Movie와 Poster의 관계를 일대다로 지정하기 위해서 사용합니다.
    //여기서 posterList라는 테이블이 새로 생성되는데 이는 @OneToMany가 기본적으로 M:N의 곽계를 구성하기 위해 처리하기 때문이다.
    //@OneToMany의 경우 @JoinTable등을 이용하여 별도의 테이블을 지정하거나 mappedBy 속성을 이용하여 하위 엔티티를 이용하는 설정을 추가할 수 있습니다.
    //mappedBy속성 : 실제 데이터베이스에서 자신은 연관관계의 주인이 아니라는 것을 명시합니다.
    //"연관관계의 주인"이라는 표현은 데이터 베이스의 관계를 생각해 보면 tbl_poster가 FK로 tbl_movie를 참조하고 있기 때문에 연관관계에서 가장 중요한 역할을 하고 있다.

    public void addPoster(Poster poster){
        poster.setIdx(this.posterList.size());
        poster.setMovie(this);
        posterList.add(poster);
    }
    //엔티티 클래스에 set 메서드는 가능하면 줄이는 것이 좋지만 하위 엔티티는 상위 엔티티에서 관리하기 편하도록 약간의 set 메서드를 지정하는 경우가 있습니다.
    //Movie 클래스에는 Poster를 추가하는 기능을 아래와 같이 추가합니다.

    //Movie 클래스에는 List<Poster> 변수를 아예 처음부터 초기화합니다.
    //이렇게 하는 이유는 Movie객체가 JPA에서 엔티티 매니저에 의해서 관리될 때 변수에 할당된 ArrayList객체도 같이 보관되도록 하려는 의도입니다.

    public void removePoster(Long ino){

        Optional<Poster> result = posterList.stream().filter(p -> p.getIno() == ino).findFirst();

        if(result.isPresent()){
            Poster poster = result.get();
            poster.setMovie(null);
            posterList.remove(poster);
        }
        changeIdx();

    }

    private void changeIdx(){
        for(int i=0; i < posterList.size(); i++){
            posterList.get(i).setIdx(i);
        }
    }
}
