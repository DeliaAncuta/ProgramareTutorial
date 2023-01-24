package MostenireOOP;

import java.util.List;

public class Audi extends Masina {

    public List<String> dotariInterioare;
    public List<String> dotariExterioare;

    public Audi(String brand, String model, String transmisie, Integer pret, List DotariInterioare, List DotariExterioare) {
        super(brand, model, transmisie, pret);
        this.dotariInterioare = DotariInterioare;
        this.dotariExterioare = DotariExterioare;
    }

    //definim o metoda punctuala pt Audi
    public void InfoAudi(){
        InfoMasina();
        System.out.println("Masina are urmatoarele dotari interioare:" + dotariInterioare);
        System.out.println("Masina are urmatoarele dotari exteriaore:" + dotariExterioare);
    }


    //Suprascriem metoda de conducere - aplicam polimorfism
    public void conduMasina(){
        System.out.println("Masina se poate conduce cu volan pe DREAPTA");
        super.conduMasina(); //apelam constructorul din parinte; orice ce ne intereseaza din parinte
    }


}
