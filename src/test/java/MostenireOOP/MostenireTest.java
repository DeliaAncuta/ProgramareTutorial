package MostenireOOP;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {

    @Test
    public void metodatest(){

        //Facem un obiect Dacia

        List<String> dotariExteriaore = new ArrayList<>();
        dotariExteriaore.add("Stergatoare electrice");
        dotariExteriaore.add("Faruri albe");
        dotariExteriaore.add("geamuri electrice");

        List<String> dotariExteriaoreSandero = new ArrayList<>();
        dotariExteriaoreSandero.add("Faruri electrice");
        dotariExteriaoreSandero.add("Geamuri incalzite");

        List<String> dotariInterioare = new ArrayList<>();
        dotariInterioare.add("Aer conditionat");
        dotariInterioare.add("Scaune cu masaj");
        dotariInterioare.add("Tableta");

        Dacia Logan = new Dacia("Dacia", "Logan", "Cutie Manuala", 5000, "Alb metalizat", dotariExteriaore);
        Logan.calculPretFinal();
        Logan.conduMasina();

        Dacia Sandero = new Dacia("Dacia", "Sandero", "Cutie Manuala", 10000, "Alba", dotariExteriaoreSandero);
        //Logan.InfoDacia();
        //Sandero.InfoDacia();

        Audi A4 = new Audi("Audi", "A4", "Cutie Automata", 5000, dotariInterioare, dotariExteriaore);
        //A4.InfoAudi();
        A4.conduMasina();

        Audi Q6 = new Audi("Audi", "Q6", "Cutie Automata", 5000, dotariInterioare, dotariExteriaore);
        //Q6.InfoAudi();

        BMW seria5 = new BMW("BMW", "seria5", "Automata", 120000, Boolean.TRUE);
        //seria5.InfoBMW();
        seria5.afisareMasini("Valoare mare");
        seria5.afisareMasini(5);

    }

}
