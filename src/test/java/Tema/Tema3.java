package Tema;

import org.asynchttpclient.ClientStats;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tema3 {

    @Test
    public void metodaTest(){
        //comparamSuma(4,4,9);
        //afisamDa();
        //comparamSuma2(2,7,3);
        //numereDiv3();
        //numereDiv5();
        //numerePozPare();
        //sumPrimelor10();
        //prodPrimelor5();
        //CarteRetete();
        CarteRetete2();
    }

    public Integer comparamSuma(Integer num1, Integer num2, Integer num3){
        Integer suma = num1 + num2;

        if(num1 != num2 && num1 != num3 && num2 != num3){
            if(suma>num3){
                System.out.println("Suma primelor doua numere este "+ suma + " si este mai mare decat al treile numar introdus");
            }else{
                System.out.println("Suma primelor doua numere este "+ suma + " si este mai mica decat al treile numar introdus");
            }
        }
        else {
            System.out.println("Numere introduse nu sunt diferite. Mai incearca!");
        }
        return suma;
    }

    public void afisamDa(){
        System.out.println("Da" + " " + "Da" + " " +"Da" + " " +"Da" + " " +"Da");
    }

    public void comparamSuma2(Integer num1, Integer num2, Integer num3){
        Integer suma = num1 + num2;


    }

    public void numereDiv3(){
        for(Integer i=0; i<=15;i++){
            if(i%3 == 0){
                System.out.println(i);
            }
        }
    }
    public void numereDiv5(){
        for(Integer i=0; i<=15;i++){
            if(i%5 == 0){
                System.out.println(i);
            }
        }
    }

    public void numerePozPare(){
        for(Integer i=0; i<=8;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }

    public void sumPrimelor10() {
        Integer sum = 0;
        for (Integer i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }

    public void prodPrimelor5(){
        Integer produsul = 1;
        for (Integer i = 1; i<=5; i++){
            produsul = produsul * i;
        }
        System.out.println(produsul);
    }

    // Exerciu cu Hashmap - carte de bucate

    public void CarteRetete(){

        HashMap <String, String> retete = new HashMap<>();

        retete.put("Retete Pui", "- Pui la cuptor");
        retete.put("Retete desert", "= Gogosi");
        retete.put("Bauturi", "Vin fiert");

        for (String key: retete.keySet()) {
            System.out.println(key + " " + retete.get(key));
        }

    }

    public void CarteRetete2() {

        List<String> reteteFelPrincipal = new ArrayList<>();

        reteteFelPrincipal.add("Pui cu orez");
        reteteFelPrincipal.add("Pizza");
        reteteFelPrincipal.add("Supa crema rosii");


        List<String> reteteDesert = new ArrayList<>();

        reteteDesert.add("Negresa");
        reteteDesert.add("Gogosi");
        reteteDesert.add("Clatite ciocolata");

        List<String> Bauturi = new ArrayList<>();

        Bauturi.add("Vin fiert");
        Bauturi.add("Mohito");
        Bauturi.add("Piña Colada");

        HashMap <String, List<String>> carteRetete = new HashMap<>();

        carteRetete.put("Retete principala", reteteFelPrincipal);
        carteRetete.put("Retete Desert", reteteDesert);
        carteRetete.put("Retete Bauturi", Bauturi);

        for (String key: carteRetete.keySet()) {
            System.out.println(key + " "+ carteRetete.get(key));
        }

    }

}

