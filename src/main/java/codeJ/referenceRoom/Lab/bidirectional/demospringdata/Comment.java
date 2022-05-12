//package codeJ.referenceRoom.Lab.bidirectional.demospringdata;
//
//import lombok.*;
//
//import javax.persistence.*;
//
//@Entity
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class Comment {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String comment;
//
//    @ManyToOne
//    private Post post;
//
//    @Override
//    public String toString() {
//        return "Comment{" +
//                "id=" + id +
//                ", comment='" + comment + '\'' +
//                ", post=" + post +
//                '}';
//    }
//}
