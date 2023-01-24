package AbstractizareInterfete;

public class AngajatStudent extends Persoana implements InterfaceAngajat, InterfaceStudent{
    public AngajatStudent(String nume, String adresa, Integer varsta) {
        super(nume, adresa, varsta);
    }


    @Override
    public void munceste() {
        System.out.println("Angajatul student invata si munceste");
    }

    @Override
    public void primesteSalar() {
        System.out.println("Angajatul student primeste si bani");
    }

    @Override
    public void mergeAcasa() {
        System.out.println("Angajatul student merge acasa");
    }

    @Override
    public void invata() {
        System.out.println("Angajatul student invata");
    }

    @Override
    public void doarme() {
        System.out.println("Angajatul student ajune de la munca si doarme");
    }

    @Override
    public void primesteBursa() {
        System.out.println("Angajatul student invata si primeste bani");
    }
}
