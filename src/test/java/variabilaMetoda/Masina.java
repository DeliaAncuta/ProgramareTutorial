package variabilaMetoda;

import org.testng.annotations.Test;

public class Masina {

    public String Marca;
    public String Model;
    public Integer Putere;

    @Test //metoda de test - Facem o singura metoda prin care testam mai multe metode;
    public void metodaTest(){
        prezentareMasina("Audi", "A4", 130);
        prezentareMasina("Seat", "leon", 100);
        prezentareMasina("Dacia", "SS", 100);

    }

    //O metoda poate sau nu sa primeasca parametrii. Parametrii se completeaza in parantele de la metoda

    public void prezentareMasina(String par1, String par2, Integer par3){ //acum metoda are parametrii

        Marca = par1;
        Model = par2;
        Putere = par3;

        System.out.println(Marca + " " + Model + " " + Putere);

    }

}
