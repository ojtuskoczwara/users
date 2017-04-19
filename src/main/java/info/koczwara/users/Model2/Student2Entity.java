package info.koczwara.users.Model2;

import javax.persistence.*;

/**
 * Created by Wojtek on 2017-04-19.
 */
@Entity
@Table(name = "student2", schema = "mojabaza", catalog = "")
public class Student2Entity {
    private int idStudenta;
    private String imie;
    private String nazwisko;
    private String miejscowosc;
    private String ulica;
    private String nrDomu;
    private int idKlasy;

    @Id
    @Column(name = "id_studenta")
    public int getIdStudenta() {
        return idStudenta;
    }

    public void setIdStudenta(int idStudenta) {
        this.idStudenta = idStudenta;
    }

    @Basic
    @Column(name = "imie")
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Basic
    @Column(name = "nazwisko")
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Basic
    @Column(name = "miejscowosc")
    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    @Basic
    @Column(name = "ulica")
    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    @Basic
    @Column(name = "nr_domu")
    public String getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(String nrDomu) {
        this.nrDomu = nrDomu;
    }

    @Basic
    @Column(name = "id_klasy")
    public int getIdKlasy() {
        return idKlasy;
    }

    public void setIdKlasy(int idKlasy) {
        this.idKlasy = idKlasy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student2Entity that = (Student2Entity) o;

        if (idStudenta != that.idStudenta) return false;
        if (idKlasy != that.idKlasy) return false;
        if (imie != null ? !imie.equals(that.imie) : that.imie != null) return false;
        if (nazwisko != null ? !nazwisko.equals(that.nazwisko) : that.nazwisko != null) return false;
        if (miejscowosc != null ? !miejscowosc.equals(that.miejscowosc) : that.miejscowosc != null) return false;
        if (ulica != null ? !ulica.equals(that.ulica) : that.ulica != null) return false;
        if (nrDomu != null ? !nrDomu.equals(that.nrDomu) : that.nrDomu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStudenta;
        result = 31 * result + (imie != null ? imie.hashCode() : 0);
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        result = 31 * result + (miejscowosc != null ? miejscowosc.hashCode() : 0);
        result = 31 * result + (ulica != null ? ulica.hashCode() : 0);
        result = 31 * result + (nrDomu != null ? nrDomu.hashCode() : 0);
        result = 31 * result + idKlasy;
        return result;
    }
}
