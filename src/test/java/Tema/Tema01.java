package Tema;

import org.testng.annotations.Test;

public class Tema01 {
    // Definesc cateva atribute pt un calculator;
    // Metoda cu atribuire valori si afisare;

    public String placaBaza;
    public Integer memorieRAM;
    public String procesor;
    public String placaVideo;
    public String SSD;
    public String modelSursa;
    public String cooler;
    public String modelCarcasa;

    @Test (priority = 1)
    public void asamblare(){

        placaBaza = "ASUS TUF GAMING Z690-PLUS WIFI";
        memorieRAM = 8;
        procesor = "Intel Core i9-12900KS";
        placaVideo = "ASUS Dual NVIDIA RTX 3060";
        SSD = "KINGSTON A400";
        modelSursa = "THERMALTAKE Litepower RGB, 550W";
        cooler = "ID-COOLING SE-207-XT";
        modelCarcasa = "PC GAMEMAX Abyss, USB 3.0";

        System.out.println("Gata pentru asamblare? " + "... " + " Incepem!!" );
        System.out.println("Primul pas - Ai nevoie de o placa de baza precum " + placaBaza + " sau orice alt model preferi." );
        System.out.println("Incepem prin a asambla cu rabdare memoria RAM si recomandam macar " + memorieRAM + "GB." );
        System.out.println("Continua prin a conecta un SSD precum: "+ SSD + " si un procesor decent ca " + procesor);
        System.out.println("Piesa de resistenta e o placa video buna! Va recomandam: " + placaVideo);
        System.out.println("Adauga un cooler si conecteaza totul la o sursa." + " " + "Recomandam un cooler precum " + cooler + " si o sursa" +
                " ca " + modelSursa);
        System.out.println("La final asambleaza totul intr-o carcasa preferata si esti GATA :) " + "Poti alege o carcasa precum: " + modelCarcasa + " :D");

    }
    @Test (priority = 2)
    public void asamblareTips(){

        String pastaTermica = "Thermal Grizzly Kryonaut";
        String sprayCompri = "Spray cu aer comprimat, 750 ml, Esperanza Typhoon XL ES124";

        System.out.println("Pentru o mai buna racire a procesorului " + procesor + "iti recomdam ca la asamblarea sa folosesti si o pasta termica precum " + pastaTermica);
        System.out.println("Un alt tips ar fi sa-ti pastrezi mereu PC-ul curat si dustFree utilizand un " + sprayCompri);

    }

}

