package MostenireOOP;

public class Masina {

    // Object oriented programin - OOP
    //Sunt 4 concepte: Mostenire - Abstractizare - Incapsulare - Polimorfism

    //Mostenire = conceptul prin care o clasa mosteneste o alta clasa (Bunici <= nepoti)
    //Clasa care mosteneste se numeste clasa copil si clasa care este mostenita este clasa parinte

    //Mostenirea se face cu  - extends -
    //In java o clasa poate sa mosteneasca o singura clasa
    //In momentul in care o clasa mosteneste o alta clasa => trebuie sa apelam prima data constructorul din parinte
    //In momentul in care o clasa mosteneste o alta clasa => putem accesa orice variabila sau metoda din clasa

    //Aplicam de Incapsulare;
    //Incapsularea datelor = conceptul prin care tinem departe de exterior valorile variabilelor pe care nu vrem sa le modificam;


    private String brand;
    private String model;
    private String transmisie;
    private Integer pret;

    //private = acces control care restrictioneaza vizibilitatea variabilei la nivel de clasa unde e declarata

    //Incapsaularea  - gettere si settere
    //Ca sa accesam / modificam valorile unor variabile private ne folosim de conceptul Get si Set

    public Masina(String brand, String model, String transmisie, Integer pret) {
        this.brand = brand;
        this.model = model;
        this.transmisie = transmisie;
        this.pret = pret;
    }

    //GET SET

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getTransmisie() {
        return transmisie;
    }

    // POLIMORFISM = conceptul prin care o metoda poate avea mai multe forme
    //Polimorfimsul e de 2 feluri = DINAMIC(override) SI STATIC(overload)
    //Polimorfismul dinamic = intr o ierahie de clase optiune prin mostenire o metoda poate avea mai multe implementari
    //P. Dinamic se aplica mereu cu mostenirea !!!!
    //Polimorfismul Static = o metoda se poate diferentia prin numarul de parametrii sau tipul lor

    public Integer getPret() {
        return pret;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTransmisie(String transmisie) {
        this.transmisie = transmisie;
    }

    public void InfoMasina(){
        System.out.println("Brandul masinii este: " + brand + " si modelul este " + model);
        System.out.println("Are transmisia " + transmisie + " si pretul de " + pret);

    }

    //Polimorfism dinamic - exemplu
    //In clasa parinte faci o metoda cu implementare de baza DAR in functie de ce masina vb (clasa copil) se conduce diferit

    public void conduMasina(){
        System.out.println("Masina se poate conduce");
    }

}
