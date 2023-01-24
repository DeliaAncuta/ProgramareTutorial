package AbstractizareInterfete;

public class Restaurant {

    private String denumire;
    private String felPrincipal;
    private Integer numarStele;

    public Restaurant(String denumire, String felPrincipal, Integer numarStele) {
        this.denumire = denumire;
        this.felPrincipal = felPrincipal;
        this.numarStele = numarStele;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getFelPrincipal() {
        return felPrincipal;
    }

    public void setFelPrincipal(String felPrincipal) {
        this.felPrincipal = felPrincipal;
    }

    public Integer getNumarStele() {
        return numarStele;
    }

    public void setNumarStele(Integer numarStele) {
        this.numarStele = numarStele;
    }
}
