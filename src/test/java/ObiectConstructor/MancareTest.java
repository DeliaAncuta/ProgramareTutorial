package ObiectConstructor;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MancareTest {


    @Test
    public void metodaTest(){
        //declaram un obiect de tipul x (in cazul acest mancare)

        /*List<String>  IngredienteSupaPui = Arrays.asList("Apa", "Pui", "Teietei");
        Mancare supaPui = new Mancare("Supa de pui", "cu teietei", IngredienteSupaPui, 300);

        supaPui.InfoMancare();*/

        /*List<String>  IngredienteCiocolata = Arrays.asList("Cacao", "lapte", "Zahar");
        Mancare Ciocolata = new Mancare("Ciocolata", "Ciocolata de casa cu zahar", IngredienteCiocolata, 500);

        Ciocolata.InfoMancare();*/

        List<String>  IngredienteCiocolataVegana = Arrays.asList("Cacao", "lapte", "Zahar");
        Mancare CiocolataVegana = new Mancare("Ciocolata", "Ciocolata de casa vegana", IngredienteCiocolataVegana, 500, Boolean.TRUE);

        CiocolataVegana.InfoMancareVegana();

    }

}
