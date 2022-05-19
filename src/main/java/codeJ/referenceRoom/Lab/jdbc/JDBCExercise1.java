package codeJ.referenceRoom.Lab.jdbc;


public class JDBCExercise1 {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Student student = dao.getStudent(1);
        System.out.println(student);


    }
}
