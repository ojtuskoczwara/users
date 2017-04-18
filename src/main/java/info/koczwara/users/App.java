package info.koczwara.users;

import info.koczwara.users.Model.Student;
import info.koczwara.users.Model.StudentDAO;
import info.koczwara.users.Model.StudentDAOImpl;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {

        wyswietlanie(1);
    }

    public static void dodawanieStudenta() {
        Student s = new Student();
        s.setStudentId(1);
        s.setImie("Adam");
        s.setNazwisko("Adgrus");
        s.setMiejscowosc("Krk");
        s.setUlica("Asaa");
        s.setNumerDomu("256");
        s.setKlasaStudentId(2);
        StudentDAOImpl studentImpl = new StudentDAOImpl();
        try {
            studentImpl.addStudent(s);
        } catch (Exception e) {
            System.out.println("TryCatch App: "+e);
        }
    }

    public static void wyswietlanie(int id ) throws SQLException {
        StudentDAO dao = new StudentDAOImpl();
        Student s3 = new Student();
        s3 = dao.getStudent(id);
        System.out.println("ID: " + s3.getStudentId());
        System.out.println("Imie:" + s3.getImie());
        System.out.println("Nazwisko: " + s3.getNazwisko());
        System.out.println("Adres: " + s3.getMiejscowosc() + ", ul. " + s3.getUlica() + " " + s3.getNumerDomu());
        System.out.println("id klasy: " + s3.getKlasaStudentId());
    }
}
