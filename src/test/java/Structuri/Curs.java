package Structuri;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Curs {

    //Structuri in programare sunt de 2 feluri: Aternative si repetitive

    // Structuri alternative - se pot realiza = if then else; switch case;
    //Structuri repetitive - se pot realiza folosind For, While, do while, for each;

    @Test
    public void metodaTest(){
        //verificare(40);
        //VerificareParPoz(30);
       VerificareZileSapt(10);

    }

    public void verificare(Integer num) {

        if (num > 10) {
            System.out.println("Numarul e mai mare ca 10");
        }
        else {
            System.out.println("Numarul e mai mic ca 10");
        }

    }

    // Verioficam daca un numar este Par si pozitiv

    public void VerificareParPoz(Integer num){
        if (num >0) {
            if(num%2 == 0) {
                System.out.println("Numarul este pozitiv si par: "+ num);
            }
            else if (num != 0){
                System.out.println("Numarul e pozitiv, dar impar: "+ num);
            }
            else {
                System.out.println("Numarul este " + num);
            }
        }else if (num != 0){
            System.out.println("Numarul este negativ! " + num);
        }
        else{
            System.out.println("Numarul este " + num);
        }
    }


    //Metoda cu Switch case
    // Afisam ziua curenta din saptamana

    // Case-ul e mai rapid decat if-ul; Switch ul se duce direct la case, dar if else-ul trece prin toate conditiile.
    public void VerificareZileSapt(Integer numar){ // Switch e mai rapid
        switch (numar){
            case 1:
                System.out.println("Ziua e Luni");
                break;
            case 2:
                System.out.println("Ziua e Marti");
                break;
            case 3:
                System.out.println("Ziua e Miercuri");
                break;
            case 4:
                System.out.println("Ziua e Joi");
                break;
            case 5:
                System.out.println("Ziua e Vineri");
                break;
            default: //conditie de iesire.
                System.out.println("sfarsit");
        }

    }
}
