package MostenireOOP;

public class BMW extends Masina {

    public Boolean semnalizare;

    public BMW(String brand, String model, String transmisie, Integer pret, Boolean Semnalizare) {
        super(brand, model, transmisie, pret);
        this.semnalizare = Semnalizare;
    }

    public void InfoBMW(){
        InfoMasina();
        System.out.println("Are semnalizare? " + semnalizare);
    }

    // Polimorfismul STATIC
    public void afisareMasini(){
        System.out.println("Polimorfism fara parametrii");
    }

    public void afisareMasini(String valoare){
        System.out.println("Polimorfism cu valoare String");
    }

    public void afisareMasini(Integer valoare){
        System.out.println("Polimorfism cu valoare Integer");
    }

    public void afisareMasini(Integer valoare, String marca){
        System.out.println("Polimorfism cu 2 parametrii");
    }

}
