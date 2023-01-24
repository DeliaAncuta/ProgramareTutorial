package Tema.Animals;

public class Pisica extends Animals {

    private String sunet;
    private Boolean pradator;

    public Pisica(String specie, String culoare, Integer numarPicioare, Boolean domensticit, String Sunet, Boolean pradator) {
        super(specie, culoare, numarPicioare, domensticit);
        this. sunet = Sunet;
        this.pradator = pradator;
    }

    public String getSunet() {
        return sunet;
    }

    public void setSunet(String sunet) {
        this.sunet = sunet;
    }

    public Boolean getPradator() {
        return pradator;
    }

    public void setPradator(Boolean pradator) {
        this.pradator = pradator;
    }

    //Aici am facut override - am aplicat polimorfism dinamic
    public void sunetAnimal(){
        System.out.println(getSpecie() + " face " + getSunet());
    }
}
