package Tema;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CartiTest {

    @Test
    public void metodaTest(){

        List<String> denumire = new ArrayList<>();
        denumire.add("--NULL--");
        denumire.add("Apa proaspata pt flori");
        denumire.add("Lantul");
        denumire.add("Vilonista de la Auchwints");

        List<String> autori = new ArrayList<>();
        autori.add("--NULL--");
        autori.add("Autor A1");
        autori.add("Autor A2");
        autori.add("Autor A3");

        Carti cartePrima= new Carti(1, denumire, autori);
        cartePrima.infoCarte(3);

    }
}
