package Tema;

import org.openqa.selenium.devtools.v106.storage.model.InterestGroupAccessed;
import org.testng.annotations.Test;

import java.lang.reflect.GenericDeclaration;

public class Tema2 {

    public Integer produsul;

    // pt fiecare cerinta facem o metoda si facem un singur teste
    @Test
    public void metodaTest(){
       helloWorld();
       varstTa(25);
       afiseazaNume("Ancuta", "Delia");
       dataAzi("20/12/2022", "18:30 PM","Marti");
       calculeaza();
       suma(2.45, 4.56, 7.48);
       produsul(5,6);
       concatenarePordusul();
       salutM();
       Hello();
       vocale();
       End();
    }

    public void helloWorld(){
        System.out.println("Hello world! ");
    }

    public Integer varstTa(Integer varsta){
        System.out.println("Varsta mea e: " + varsta + " ani.");
        return varsta;
    }

    public String afiseazaNume (String nume, String prenume){
        System.out.println("Numele meu este: "+ nume);
        System.out.println("Iar prenumele este: "+ prenume);
        return nume ;
    }

    public String dataAzi(String data, String ora, String ziua){
        System.out.println("Azi "+ data);
        System.out.println("Ora "+ ora);
        System.out.println("E "+ ziua);
        return data;
    }

    public void calculeaza (){
        float sumaFinala; //[2+(3*4)-3]/3

        Integer suma1 = 3*4;
        Integer suma2 = 2 + suma1 - 3;
        sumaFinala = suma2 /3.00f;

        System.out.println("Cat face [2+(3*4)-3]/3 ?");
        System.out.println("Rezultatul corect este: " + sumaFinala);
    }

    public Double suma(Double var1, Double var2, Double var3){
        Double suma = var1 + var2 +var3;
        System.out.println("Suma pt. numele introduse este: " + suma);

        return suma;
    }

    public Integer produsul(Integer var1, Integer var2){
        produsul = var1 * var2;
        System.out.println("Produsul pt. numele introduse este: " + produsul);

        return produsul;
    }

    public void concatenarePordusul(){

        System.out.println("Stiu ca am calculat bine "+ produsul);
    }

    public void salutM(){
        System.out.println("Salut"+"M");
    }

    public void Hello(){
        System.out.println("H"+"Hello");
    }

    public void vocale(){
        System.out.println("Aznaz" + " " + "azrez"+ " " +"mezrez," + " " + "pezrez," + " " + "pruzmez." );

    }

    public void End(){
        System.out.println("Poti pleca acasa dupa ce iti verific munca!");
    }
}
