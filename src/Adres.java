import java.util.regex.Pattern;

public class Adres {


    private String ulica;
    private String numerDomu;
    private String kodPocztowy;
    private String miasto;


    public Adres(String ulica,  String numerDomu,  String kodPocztowy,  String miasto) {
        setUlica(ulica);
        setNumerDomu(numerDomu);
        setKodPocztowy(kodPocztowy);
        setMiasto(miasto);
    }


    public String getUlica() {
        return this.ulica;
    }

    public void setUlica(String ulica) {
        if(ulica==null) {
            throw new IllegalArgumentException("Ulica nie moze byc numerem");
        }
        this.ulica = ulica;
    }

    public String getNumerDomu() {

        return this.numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        Pattern pattern = Pattern.compile("^[0-9]+[a-zA-Z]*$");
        if(!pattern.matcher(numerDomu).matches()) {
            throw new IllegalArgumentException("Bledny format numeru domu");
        }
        this.numerDomu = numerDomu;
    }

    public String getKodPocztowy() {
        return this.kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        Pattern pattern = Pattern.compile("^[0-9]{2}-[0-9]{3}$");
        if(!pattern.matcher(kodPocztowy).matches()) {
            throw new IllegalArgumentException("Zly format kodu pocztowego");
        }
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiasto() {
        if (miasto==null) {
            throw new IllegalArgumentException("Miasto nie moze byc puste");
        }
        return this.miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }









}
