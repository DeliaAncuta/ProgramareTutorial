package Tema.Animals;

public class Animals {

    private String specie;
    private String culoare;
    private Integer numarPicioare;
    private Boolean domensticit;

    //Am definit constructorul clasei Animals

    public Animals(String specie, String culoare, Integer numarPicioare, Boolean domensticit) {
        this.specie = specie;
        this.culoare = culoare;
        this.numarPicioare = numarPicioare;
        this.domensticit = domensticit;
    }

    //Definesc getterii

    public String getSpecie() {
        return specie;
    }

    public String getCuloare() {
        return culoare;
    }

    public Integer getNumarPicioare() {
        return numarPicioare;
    }

    public Boolean getDomensticit() {
        return domensticit;
    }

    //Definesc setarii doar pt ce variabile vreau eu sa fie posibil modificate


    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setDomensticit(Boolean domensticit) {
        this.domensticit = domensticit;
    }

    //Definesc o metoda de baza pentru toate animalele

    public void InfoAnimal(){
        System.out.println("Animalul este din specia " + getSpecie() + " si are " + getNumarPicioare() + " picioare.");
        System.out.println("Are culoarea " + getCuloare());
        System.out.println("Crezi ca este usor de domesticit? " + getDomensticit());
    }

    public void sunetAnimal(){
        System.out.println(getSpecie() + " face ");
    }
}
