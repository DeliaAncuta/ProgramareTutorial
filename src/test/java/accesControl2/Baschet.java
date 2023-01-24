package accesControl2;

import accesControl.Sport;

public class Baschet extends Sport {

    public void metodaSimpla(){
        metodaProtected(); // apare cand se aplica mostenirea - nnu conteaza ca e in pachete diferite
        metodaPublica();
    }


}
