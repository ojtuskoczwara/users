package info.koczwara.users.Model;

import java.sql.*;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    public void addStudent(Student student) throws SQLException {
        String sql = "INSERT INTO Student2(id_studenta,imie,nazwisko,miejscowosc," +
                "ulica,nr_domu,id_klasy) VALUES(?,?,?,?,?,?,?)";
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //Connection
            Class.forName("com.mysql.jdbc.Driver");
            String USER = "tutorial";
            String PASSWORD = "password";
            String URL = "jdbc:mysql://localhost:3306/mojaBaza?verifyServerCertificate=false&useSSL=true";
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            //Preparation
            statement = connection.prepareStatement(sql);
            statement.setInt(1, student.getStudentId());
            statement.setString(2, student.getImie());
            statement.setString(3, student.getNazwisko());
            statement.setString(4, student.getMiejscowosc());
            statement.setString(5, student.getUlica());
            statement.setString(6, student.getNumerDomu());
            statement.setInt(7, student.getKlasaStudentId());
            //Execution
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("TryCatch StudentDAOImpl: "+e);
        }
        statement.close();
        connection.close();
    }


    public Student getStudent(int studentId) throws SQLException {
        String sql = "SELECT * FROM Student2 WHERE id_studenta=?";
        Student student = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            //Connection
            Class.forName("com.mysql.jdbc.Driver");
            String USER = "tutorial";
            String PASSWORD = "password";
            String URL = "jdbc:mysql://localhost:3306/mojaBaza?verifyServerCertificate=false&useSSL=true";
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            //Preparation
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, studentId);
            //Execution
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                student = new Student();
                student.setStudentId(resultSet.getInt("id_studenta"));
                student.setImie(resultSet.getString("imie"));
                student.setNazwisko(resultSet.getString("nazwisko"));
                student.setMiejscowosc(resultSet.getString("miejscowosc"));
                student.setUlica(resultSet.getString("ulica"));
                student.setNumerDomu(resultSet.getString("nr_domu"));
                student.setKlasaStudentId(resultSet.getInt("id_klasy"));
            }
            return student;
        } catch (Exception e) {
            System.out.println(e);
        }
        preparedStatement.close();
        resultSet.close();
        connection.close();

        return null;
    }

    public List<Student> getAllStudents() throws SQLException {
        return null;
    }

    public List<Student> getAllStudentInKlasa() throws SQLException {
        return null;
    }

    public void updateStudent(Student student) throws SQLException {

    }

    public void deleteStudent(int studentId) throws SQLException {

    }

    public void deleteAllStudents() throws SQLException {

    }


}
