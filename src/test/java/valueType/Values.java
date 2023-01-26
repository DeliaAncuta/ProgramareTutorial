package valueType;

import org.testng.annotations.Test;

public class Values {

    //diferenta intre int si integer

    public int variabila1; //primitiva = value type - primitiva
    public Integer varibaial2; //Refference type //are cateva metode definite pe care le putem accesa cu punct
    public double variabila3;
    public Double variabila4; //asa merge si la float si la boolean si la caracter - //Aceasta diferenta este in Java, in c# nu este


    @Test
    public void metodaTest(){
        variabila1 = 5;
        varibaial2 =10;
       // System.out.println(variabila1);
       // calcul(variabila1);
      //  System.out.println(variabila1);//este tot 5 pt ca valoarea initiala  value de baza este 5 asdignata pe un int

        Jucarie popusa = new Jucarie("Papusa");
        popusa.InfoJucarie();
        popusa.setNume("Masina"); //ii modificam valoarea alocata in memorie
        popusa.InfoJucarie();

    }

    public void calcul(Integer x){
        x = x+ 1;
        System.out.println(x);
    }



}
