package AbstractizareInterfete;

public class RestaurantMixt extends Restaurant implements RestaurantCarneInterface, RestaurantVeganInterface{

    public RestaurantMixt(String denumire, String felPrincipal, Integer numarStele) {
        super(denumire, felPrincipal, numarStele);
    }

    @Override
    public void cumparaCarne() {
        System.out.println("Cumpara carne pt retetele mixt");
    }

    @Override
    public void cresteAnimale() {
        System.out.println("Creste animale pt retetele mixt");
    }

    @Override
    public void preparaCarne() {
        System.out.println("Prepara carnea pt retetele mixt");
    }

    @Override
    public void cresteLegume() {
        System.out.println("Cultiva legume pt retetele mixt");
    }

    @Override
    public void cumparaZarzavat() {
        System.out.println("Cumpara zarzavat pt retetele mixt");
    }

    @Override
    public void preparaLegume() {
        System.out.println("Prepara legumele pt retetele mixt");
    }
}
