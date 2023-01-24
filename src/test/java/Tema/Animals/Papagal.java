package Tema.Animals;

public class Papagal extends Animals{

    private Boolean zboara;
    private String sunet;

    public Papagal(String specie, String culoare, Integer numarPicioare, Boolean domensticit, Boolean Zboara, String sunet) {
        super(specie, culoare, numarPicioare, domensticit);
        this.zboara = Zboara;
        this.sunet = sunet;
    }

    public Boolean getZboara() {
        return zboara;
    }

    public void setZboara(Boolean zboara) {
        this.zboara = zboara;
    }

    public String getSunet() {
        return sunet;
    }

    public void setSunet(String sunet) {
        this.sunet = sunet;
    }

    //Aici am facut override - am aplicat polimorfism dinamic
    public void sunetAnimal(){
        System.out.println(getSpecie() + " face " + getSunet());
    }


    //Aici fac un plomorfism static
    public void culoarePapagal(){
        System.out.println("Papagalii pot fi foarte colorati");
    }

    public void culoarePapagal(String culoare){
        System.out.println("Acest papagal are culoare penajului " + culoare);
    }

    public void culoarePapagal(String deUnde, String culoare){
        System.out.println("Papagalii din " + deUnde + " au deobicei penajul de culoarea " + culoare);
    }

    public void culoarePapagal(Integer varsta, String culoare){
        System.out.println("Papagalii cu varsta de peste " + varsta + " ani tind sa aiba penajul de culoarea " + culoare);
    }
}
