package valueType;

public class Jucarie {

    public String nume;

    public Jucarie(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void InfoJucarie(){
        System.out.println(nume);
    }
}
