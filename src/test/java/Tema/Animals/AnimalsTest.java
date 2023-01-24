package Tema.Animals;

import Tema.Animals.Tigru;
import org.testng.annotations.Test;

public class AnimalsTest {

    @Test
    public void metodaTest(){

        Tigru tigruSiberia = new Tigru("Tigru de Siberia", "Alb", 4, Boolean.FALSE, "Miau puternic", "Siberia - zona rece");
       // tigruSiberia.InfoAnimal();
       //tigruSiberia.sunetAnimal();

        Pisica pisicaSalbatica = new Pisica("Pisica salbatica", "Bej", 4, Boolean.FALSE, "Miau incet", Boolean.TRUE);
       // pisicaSalbatica.InfoAnimal();
        //pisicaSalbatica.sunetAnimal();

        Papagal cockatiel = new Papagal("Cockatiel", "Gri/Alb/Galben", 2, Boolean.TRUE, Boolean.TRUE, "Cip-ci-rip");
        //cockatiel.InfoAnimal();
        cockatiel.sunetAnimal();

        cockatiel.culoarePapagal();
        cockatiel.culoarePapagal("Rosu");
        cockatiel.culoarePapagal("Australia", "Portocaliu");
        cockatiel.culoarePapagal(4, "rosu aprins");



    }



}
