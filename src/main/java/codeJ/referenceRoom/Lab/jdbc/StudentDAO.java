package codeJ.referenceRoom.Lab.jdbc;


import lombok.extern.log4j.Log4j2;

import java.sql.*;

@Log4j2
public class StudentDAO {




    private static String dbUrl="jdbc:mysql://localhost:3306/bookex?serverTimezone=Asia/Seoul&useSSL=false";
    private static String dbUser="codeJ";
    private static String dbPasswd="yjy^^46232891";

    public Student getStudent(Integer stuNo){
        Student student = null;
        Connection conn = null; //DB와 연결을 위한 객체                     (연결을 맺을 객체)
        PreparedStatement ps = null;    //SQL 문을 DB에 보내기 위한 객체     (명령을 선언할 객체)
        ResultSet rs = null;    //SQL 질의에 생성된 테이블을 저장하는 객체      (결과값을 담아낼 객체)

        //executeQuery : SELECT 문
        //반환값 : ResultSet 클래스의 인스턴스로 반환

        //executeUpdate : INSERT,DELETE,UPDATE 문
        //반환값 : int

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  //JDBC 드라이버 로딩
            conn = DriverManager.getConnection(dbUrl, dbUser, dbPasswd);


            String sql = "SELECT * FROM student WHERE stu_no = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,stuNo); //? 파라미터 값에 setInt를 이용하여 stuNo 매핑
            rs = ps.executeQuery();//명령어 실행

            if(rs.next()){
                int stuNum = rs.getInt(1);
                String id = rs.getString("id");
                String passwd = rs.getString("passwd");
                String email = rs.getString("email");
                String phoneNum = rs.getString("phoneNum");
                student = new Student(stuNum,id,passwd,email,phoneNum);
                log.info(stuNum+" "+id+" "+passwd+" "+email+" "+phoneNum);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            //사용순서와 반대로 close 합니다.
            if(rs != null){
                try{
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(ps != null){
                try{
                    ps.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try{
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }//연결한 부분 닫아주기 finally는 반드시 수행합니다.
        return student;
}
}