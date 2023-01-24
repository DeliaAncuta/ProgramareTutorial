package AbstractizareInterfete;

public class Persoana {

    //Abstractizare - conceptul prin care definim comportamentul unei clase
    //Acest concept se poate realiza in JAVA cu interfete sau clase abstracte
    // Interfata - colectie de metode care sunt doar abstracte (= nu au body)
    // Recunoastem o interfata dupa cuvantul Interface
    //Intr o interfata nu avem un constructor => nu putem face un obiect
    //Clasa care implementeaza interfata => trebuie sa implementeze toate metodele interfetei
    //O clasa abstracta poate sa implementeze o interfata
    //o clasa poate sa implementeze n interfete
    //O interfata poate sa mosteneasca o alta interfata
    //  Toate metofdele dintr o interfata sunt publice

    private String nume;
    private String adresa;
    private Integer varsta;

    public Persoana(String nume, String adresa, Integer varsta) {
        this.nume = nume;
        this.adresa = adresa;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }


}
