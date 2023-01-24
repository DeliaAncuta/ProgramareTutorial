package ObiectConstructor;

import java.util.List;

public class Telefon {

    public String brand;
    public String model;
    public Integer anFabricatie;
    public String sistemOperare;

    public List caracteristici;

    public Double pret;
    public Boolean redus;

    public Telefon(String brand, String model, Integer anFabricatie, String sistemOperare, List caracteristici) {
        this.brand = brand;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.sistemOperare = sistemOperare;
        this.caracteristici = caracteristici;
    }

    public Telefon(String brand, String model, Double pret, Boolean redus) {
        this.brand = brand;
        this.model = model;
        this.pret = pret;
        this.redus = redus;
    }




    public void vechimeTelefon(){
        if(pret != null){
            System.out.println("Pretul este " + pret);
        }
        else{
            System.out.println("Telefonul este de prezentare");
        }

        if(anFabricatie>=2020){
            System.out.println("Telefonul ales este mai nou de anul 2020");
        }
        if(anFabricatie>=2015 && anFabricatie<=2019){
            System.out.println("Telefonul este aproape nou, dar nu foarte");
        }
        if(anFabricatie<2015){
            System.out.println("Telefonul este vechi");
        }
    }

    public void vanzareTelefon(){
        if(pret != null){
            System.out.println("Pretul este " + pret);
        }
        else{
            System.out.println("Telefonul este de prezentare");
        }
    }

    public void discounttelefon(Double discount){
        if(pret != null){
            Double Diferenta = (discount*pret)/100;
            Double pretNou = pret - Diferenta;
            System.out.println("Noul pret al telefonului este "+ pretNou);
        }
        else{
            System.out.println("Telefonul este de prezentare");
        }
    }



}
