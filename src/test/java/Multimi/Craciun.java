package Multimi;

import org.testng.annotations.Test;

import java.security.Key;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Craciun {

    /*
    ca sa parcurgi o multime mai intai definim multimea. Toate elementele din multime sa fie de acelasi tip.
    Depinde cum parcurgi multimea - 3 tipuri ca si exemplu;
     */
    @Test
    public void metodaTest(){
        //multimeNumeArray();
        // multimeNumeLista();
       //multimeValori();
        multimeValori2();
    }

    //Array - (Tradus - Vectori)



    public void multimeNumeArray(){

        String[] numeCursati = new String[5]; //poate sa contina maxim 5 elemente
        numeCursati[0] = "Delia";
        numeCursati[1] = "Daniela";
        numeCursati[2] = "Roxana";
        numeCursati[3] = "Alex";
        numeCursati[4] = "Ada";
        //numeCursati[5] = "J";

        for (Integer i = 0; i< numeCursati.length; i++ ){ //i< numeCursati.length; ca sa nu modificam for ul
            System.out.println(numeCursati[i]);
        }
    }

    //Lista

    public void multimeNumeLista(){

        List<String> numeCursanti = new ArrayList<>(); //nu trebuie sa i spui un numar de pozitii pt ca se adapteaza.
        numeCursanti.add("Delia"); //automat stie e se duce pe pozitia 0 si tot creste
        numeCursanti.add("Razvan");
        numeCursanti.add("Daniela");

        for (Integer i=0;i<numeCursanti.size();i++){ //lista nu are .length, la lista se pune.size()
            System.out.println(numeCursanti.get(i)); //ca sa chemam elementele din lista numeCursanti.get(i)
        }
    }

    //Hashmap - Key = value

    public void multimeValori(){
        //Forbal, cana, acadea - valori
        //Sport, Obiect, Dulce - key

        HashMap < String, String> Obiecte = new HashMap<>();

        Obiecte.put("Sport", "Fotbal");
        Obiecte.put("Obiect", "Cana");
        Obiecte.put("Dulce", "Acadea");

        //for each
        for(String key: Obiecte.keySet()){
            System.out.println(key + " " + Obiecte.get(key));
        }


    }
    // Tari orase

    public void multimeValori2(){

        List<String> oraseRomania = new ArrayList<>();

        oraseRomania.add("Craiova");
        oraseRomania.add("Iasi");
        oraseRomania.add("Bucuresti");

        List<String> oraseItalia = new ArrayList<>();

        oraseItalia.add("Roma");
        oraseItalia.add("Venetia");
        oraseItalia.add("Florenta");

        List<String> oraseSpania = new ArrayList<>();

        oraseSpania.add("Valensia");
        oraseSpania.add("Madrid");
        oraseSpania.add("Barcelona");


        HashMap <String, List<String>> Tari = new HashMap<>();

        Tari.put("Romania", oraseRomania);
        Tari.put("Italia", oraseItalia);
        Tari.put("Spania", oraseSpania);

        for(String key: Tari.keySet()){
            System.out.println(key + " " + Tari.get(key));
        }
    }

}
