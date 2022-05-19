package codeJ.referenceRoom.Lab.jdbc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class Student {

    private Integer stu_no;
    private String id;
    private String passwd;
    private String email;
    private String phoneNum;

    public Student(Integer stuNo, String id, String passwd, String email, String phoneNum) {
        super();
        this.stu_no = stuNo;
        this.id = id;
        this.passwd = passwd;
        this.email = email;
        this.phoneNum = phoneNum;
    }

}
