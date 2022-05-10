package codeJ.referenceRoom.Lab.bidirectional.demospringdata;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "post")
    public void addComment(Comment comment){
        this.getComments().add(comment);
        comment.setPost(this);
    }
}
