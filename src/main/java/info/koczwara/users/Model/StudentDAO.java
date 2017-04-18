package info.koczwara.users.Model;

import java.sql.SQLException;
import java.util.List;


public interface StudentDAO {

    public void addStudent(Student student) throws SQLException;

    public Student getStudent(int studentId) throws SQLException;

    public List<Student> getAllStudents() throws SQLException;

    public List<Student> getAllStudentInKlasa() throws SQLException;

    public void updateStudent(Student student) throws SQLException;

    public void deleteStudent(int studentId) throws SQLException;

    public void deleteAllStudents() throws SQLException;
}
