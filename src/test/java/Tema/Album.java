package Tema;

import java.util.Arrays;
import java.util.List;

public class Album {

    //Am definit variabilele clasei
    Integer idAlbum;
    String denumire;
    String genMuzica;
    List artisti;

    List denumireAlbum;
    Integer anAparitie;
    Integer numarPiese;
    Integer premii;
    Integer vanzari;
    Integer pret;
    Boolean disponibil;
    Boolean redus;
    Boolean cadou;
    Boolean cuAutograf;


    //Am definit 3 constructori
   Album(Integer IDAlbum, List DenumireAlbum, List Artisti, Integer AnAparitie, Integer NumarPiese, Integer Vanzari, String GenMuzica ){
       this.idAlbum = IDAlbum;
       this.denumireAlbum = DenumireAlbum;
       this.artisti = Artisti;
       this.anAparitie = AnAparitie;
       this.numarPiese = NumarPiese;
       this.vanzari = Vanzari;
       this.genMuzica =GenMuzica;
   }

   Album(Integer IDAlbum, List DenumireAlbum, List Artisti, Integer Pret, Boolean Disponibil, Boolean Redus, Boolean Cadou){
       this.idAlbum = IDAlbum;
       this.denumireAlbum = DenumireAlbum;
       this.artisti = Artisti;
       this.pret = Pret;
       this.disponibil = Disponibil;
       this.redus = Redus;
       this.cadou = Cadou;
   }

    public Album(Integer idAlbum, List DenumireAlbum, String genMuzica, List Artisti, Integer anAparitie, Integer premii, Boolean cuAutograf) {
        this.idAlbum = idAlbum;
        this.denumireAlbum = DenumireAlbum;
        this.genMuzica = genMuzica;
        this.artisti = Artisti;
        this.anAparitie = anAparitie;
        this.premii = premii;
        this.cuAutograf = cuAutograf;
    }

    // Definesc metodele (actiunile) aferente obiectului

    public void InfoAlbumSelectat(){
        //System.out.println("Albumul selectat este " + denumire + " aparut in anul " + anAparitie);

        for(Integer i = 0; i <denumireAlbum.size(); i ++){
            if(denumireAlbum.indexOf(denumireAlbum.get(i)) == idAlbum){
                System.out.println("Albumul selectat este " + denumireAlbum.get(i) + " aparut in anul " + anAparitie);
            }
        }

        for(Integer i = 0; i <artisti.size(); i ++){
            if(artisti.indexOf(artisti.get(i)) == idAlbum){
                System.out.println("Artist " + artisti.get(i));
            }
        }
        /*for(Integer i = 0; i <artisti.size(); i ++){
            System.out.println(artisti.get(i));
        }*/

        System.out.println("Albumul selectat are " + numarPiese + " piese si avut " + vanzari + " milioane vanzari");
    }

    public void AddAlbum(){

        for(Integer i = 0; i <denumireAlbum.size(); i ++){
            if(denumireAlbum.indexOf(denumireAlbum.get(i)) == idAlbum){
                System.out.println("Albumul selectat este " + denumireAlbum.get(i));
            }
        }

        for(Integer i = 0; i <artisti.size(); i ++){
            if(artisti.indexOf(artisti.get(i)) == idAlbum){
                System.out.println("Artist " + artisti.get(i));
            }
        }
        if(pret >0 && disponibil){
            System.out.println("Exista in gestiune");
        }
       if(redus){
           System.out.println("Beneficiezi de o reducere de 15%");
       }
        System.out.println("Nu prezinta reducere");
       if (cadou){
           System.out.println("Este impachetat pentru cadou");
       }
    }

    public void albumAutograf(){
        for(Integer i = 0; i <denumireAlbum.size(); i ++){
            if(denumireAlbum.indexOf(denumireAlbum.get(i)) == idAlbum){
                System.out.println("Albumul selectat este " + denumireAlbum.get(i) + " aparut in anul " + anAparitie);
            }
        }

        for(Integer i = 0; i <artisti.size(); i ++){
            if(artisti.indexOf(artisti.get(i)) == idAlbum){
                System.out.println("Artist " + artisti.get(i));
            }
        }
        System.out.println("Albumul a castigat " + premii + " premii.");
        if(cuAutograf){
            System.out.println("Au fost vandute si albume cu autograf");
        }
    }

}
