package variabilaMetoda;

import org.testng.annotations.Test;

import java.io.FileOutputStream;

public class Student {

    /*Comentariu
    Clasa = sablon care contine variabile si metode.
    Intr un fisier Java putem avea mai multe clase diferentiate prin numele lor (Nu e un lucru bun sa ai mai multe clase).
    O clasa trebuie sa aiba un nume -- > O clasa se recunoaste dupa cuvantul Class.
    Tot timpul o clasa trebuie sa fie publica.
    Variabila = atributul unei clase - caracteristica Obiectului
    Variabilele sunt de 2 feluri - Global si Local
    Variabila Globala = este vizibila peste tot in program - pot fi Share-uite si intre pachete;
    Variabila Locala = este vizibila doar in locul unde o declari
     */

    //Definire Atribute
    public String nume = new String(); // Variabila Globala - nu e pusa in metoda;
    public String prenume;
    public String adresa;
    public Integer varsta;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean esteAngajat;

    /*Metoda  - actiune la nivel de clasa - asupra Obiectului
    Metodele sunt de 2 feluri - Void si Return;
    Void  - sa vezi tu rezultatul - sa accesezi repede informatia
    Retur - Sa returneze ceva; */

    @Test // ca sa rulam - testNG - aici facem test Unit *Putem folosi si jUnit

    //Structura unei metode
    public void prezentareStudent(){
        nume = "Delia";
        prenume = "Ancuta";
        adresa = "Craiova, Dolj";
        varsta = 25;
        inaltime = 1.69;
        greutate = 55.3f; //cu f in coada ca sa stie ca este Float ca astfel crede ca e Double
        sex = 'F'; //Cand char - un singur apostrof;
        esteAngajat = true;

        System.out.println("Numele studentului este: " + nume + " " + prenume + " in varsta de " + varsta + " ani."); //println ca sa ti afiseze pe fiecare rand.
        System.out.println("Adresa studentului: " + adresa + ".");
        System.out.println("Este angajat in prezent? " + esteAngajat + ".");
        System.out.println("Inaltime: " + inaltime + " cm, Greutate: " + greutate + " kg, sex: " + sex);
    }
    @Test
    public void AdaugareNume(){

        nume = "Delia";
        prenume = "Ancuta";

        String prenumeNou = "Loreda"; //Declaram o Variabila locala - fara public in fata; Pt ca e locala am si initializat-o.
        System.out.println("Numele complet al studentului este: " + nume + " " + prenumeNou +  " " + prenume +  ".");

         // apelam metoda sa se afiseze aici
        System.out.println("Bonusul de craciun este " + String.format("%.3f", getBonus())); // String.format("%.3f", getBonus()) imi converteste rezultatul cu cate zecimale vreau eu

    }

    //Metoda de return

    // Dupa public punem ce tip de data vrem sa returneze

    public Double getBonus() {

        Double Bonus = 1.000; //variabila locala in aceasta metoda de return
        return Bonus;
    }

}


