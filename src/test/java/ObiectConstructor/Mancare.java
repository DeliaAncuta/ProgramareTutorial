package ObiectConstructor;

import java.sql.SQLOutput;
import java.util.List;

public class Mancare {

    //Constructor =  are ca rol sa initialeze variabilele unei clase
    //Constructorul are mereu acelasi nume cu clasa
    //Intr o clasa putem sa avem o multime de constructori(delimitati prin numar de parametrii/tip parametrii )
    //De cele mai multe ori constructorul este public
    //Daca intr o clasa nu am declarat un constructor  => exista unul bydefaul care nu are parametrii
    //Exista constructori cu parametrii si fara


    //Obiectul este instanta unei clase
    //Dintr o clasa putem face o multime de obiecte
    //obiectele se diferentiaza prin nume
    //In momnetul in care initializam un obiect => se apeleaza constructorul clasei

    //Definim parametrii
    public String nume;
    public String descriere;
    public List<String> Ingrediente;
    public Integer calorii;
    public Boolean Vegan;

    //Declaram un constructor cu parametrii

    public Mancare(String nume, String descriere, List Ingrediente, Integer calorii){ //Stim ca e constructor pt ca e public si are numele clasei
        this.nume = nume;
        this.descriere = descriere;
        this.Ingrediente = Ingrediente;
        this.calorii = calorii;

    }

    public Mancare(String nume, String descriere, List<String> ingrediente, Integer calorii, Boolean vegan) {
        this.nume = nume;
        this.descriere = descriere;
        Ingrediente = ingrediente;
        this.calorii = calorii;
        Vegan = vegan;
    }


    //Aici definim metodele(actiunile) obiectului
    public void InfoMancare() {
        System.out.println("Numele mancarii este " + nume);
        System.out.println(descriere);
        System.out.println("Sunt necesare urmatoarele ingrediente: ");
        for(Integer i=0; i<Ingrediente.size(); i++){
            System.out.println(Ingrediente.get(i));
        }
        System.out.println("Acest fel de mancare are " + calorii + " calorii");
    }

    public void InfoMancareVegana() {
        System.out.println("Numele mancarii este " + nume);
        System.out.println(descriere);
        System.out.println("Sunt necesare urmatoarele ingrediente: ");
        for(Integer i=0; i<Ingrediente.size(); i++){
            System.out.println(Ingrediente.get(i));
        }
        if(Vegan != null && Vegan == Boolean.TRUE){
            System.out.println("Mancare e vegana");
        }
    }



}

