package accesControl2;

import accesControl.Sport;

public class Inot {

    public void metoda(){
        Sport sport = new Sport();
        sport.metodaPublica(); //aici nu mai apare metoda protected  - deci la obiect din alt pachet nu se vede metoda obiected

        //protected este vizibil la mostenire indiferente de pachet
        //insa la crearea obiectelor, protected nu se mai vede daca iesim din pachet
    }
}
