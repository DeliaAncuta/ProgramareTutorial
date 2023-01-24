package Tema.Animals;

import Tema.Animals.Animals;

public class Tigru extends Animals {

    private String sunet;
    private String habitat;

    public Tigru(String specie, String culoare, Integer numarPicioare, Boolean domensticit, String Sunet, String Habitat) {
        super(specie, culoare, numarPicioare, domensticit);
        this.sunet = Sunet;
        this.habitat = Habitat;
    }

    //Definesc gettere si settere pt variabilele noi aferente acestei clase
    public String getSunet() {
        return sunet;
    }

    public void setSunet(String sunet) {
        this.sunet = sunet;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    //Aici am facut override - am aplicat polimorfism dinamic
    public void sunetAnimal(){
        System.out.println(getSpecie() + " face " + getSunet());
    }
}
