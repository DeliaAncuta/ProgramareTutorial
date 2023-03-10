package AbstractizareClasa;

public abstract class Persona {

    //o clasa abstracta poate sau nu sa contina metode abstracte
    //clasa care mosteneste clasa abstracta => implemeteaza toate metodele abstracte
    //putem mosteni o singura clasa abstracta
    //o clasa abstracta poate implementa o interfata
    //intr o clasa abstracta poti avea un constructor => dar nu putem face un obiect
    //Intr o clasa abstracta putem avea metode private, public, protected
    //metodele abstracte trebuie sa contina cuvantul abstract

    //Definim metode abstracte
    public abstract void munceste();

    public abstract void primesteSalariu();

    public abstract void mergeLaCurs();
    public abstract void primesteBursa();

    //Definim metode simple
    public void curs(){
        System.out.println("metoda simpla");
    }


}
