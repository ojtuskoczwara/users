package info.koczwara.users.Model;

public class Student {

    private int studentId;
    private String imie;
    private String nazwisko;
    private String miejscowosc;
    private String ulica;
    private String numerDomu;
    private int klasaStudentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        this.numerDomu = numerDomu;
    }

    public int getKlasaStudentId() {
        return klasaStudentId;
    }

    public void setKlasaStudentId(int klasaStudentId) {
        this.klasaStudentId = klasaStudentId;
    }
}
