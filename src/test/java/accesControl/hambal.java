package accesControl;

public class hambal {

    public void hambalMetoda(){

        Sport tenis = new Sport(); //definim un obiect
        tenis.metodaProtected(); // apare pt ca in acelasi pachet
        tenis.metodaPublica();

    }
}
