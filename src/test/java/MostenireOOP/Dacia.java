package MostenireOOP;

import java.util.List;

public class Dacia extends Masina{

    //prima data chemam constructorul

    private String culoare;
    private List<String> dotariExterioare;


    public Dacia(String brand, String model, String transmisie, Integer pret, String Culoare, List DotariExterioare) {
        //super = apeleaza constructorul din clasa parinte
        super(brand, model, transmisie, pret);
        this.culoare = Culoare;
        this.dotariExterioare = DotariExterioare;

    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }

    //definim o metoda punctuala pt Dacia
    public void InfoDacia(){
        InfoMasina();
        System.out.println("Culoarea selectata este:" + culoare);
        System.out.println("Dotarile interioare sunt: " + dotariExterioare);
    }

    public void calculPretFinal(){

        Integer pretfinal;

        if(culoare.contains("metalizat")){
            pretfinal = getPret() + 500;
        }
        else{
            pretfinal = getPret() + 100;
        }

        // Calculam pretul pe baza dotarilor

        for (String dotare:dotariExterioare)
        {
            switch (dotare){
                case "geamuri electrice":
                    pretfinal = pretfinal + 600;
                    break;
                case "Stergatoare electrice":
                    pretfinal = pretfinal + 200;
                    break;
                case "Faruri albe":
                    pretfinal = pretfinal+ 600;
                    break;
            }
        }

        System.out.println("Pretul final al masinii este " + pretfinal);

        //suprascriu metoda din parinte - legat de polimorfism dinamic
    }

    public void conduMasina(){
       // System.out.println("Masina se poate conduce cu volan pe stanga");
       //super.conduMasina(); //apelam constructorul din parinte; orice ce ne intereseaza din parinte

        switch (getModel()){
            case "Logan":
                System.out.println("Loganul se conduce pe stanga");
                break;
            case "Sandero":
                System.out.println("Loganul se conduce pe dreapta");
                break;
        }
    }






}
