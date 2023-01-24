package Structuri;

import org.testng.annotations.Test;

public class Cursant {

    // Structuri repetive: For, While (primele 2 cele mai cunoscute), do while, for each -


    @Test
    public void metodaTest(){
        //numereFor();
        //numereWhile();
        //numereDoWhile();
        //numereDivizibile();
        numereImparDiviz(20);
    }
    // Afisam primele 10 numere

    public void numereFor(){ //For ul are un numar definit de pasi
        Integer i;
        for (i = 0; i < 10; i++){ //i++ i = i + 2 //i-- decrementare
            System.out.println(i);
        }
    }

    public void numereWhile(){  //spargem conditiile de la for  // While are numar infinit de pasi
        Integer i = 0;
        while (i <10){
            System.out.println(i);
            i++;
        }
    }

    public void numereDoWhile(){
        Integer i = 0;
        do {
            System.out.println(i);
            i++;
        }while (i<10);
    }

    //numere de la 0 la 20 si numere divizile cu 3
    public void numereDivizibile(){
        Integer i;
        for (i = 0; i <= 20; i++){
            if (i%3 ==0){
                System.out.println(i);
            }
        }
    }

    //afisam numere impare si divizibile cu 5 (interval random)

    public void numereImparDiviz(Integer capat){
       Integer i;
       for(i=0; i< capat; i++){
           if (i%5 ==0 && i%2 ==1){
               System.out.println(i);
           }
       }
    }

    //
}
