package Tema;

import io.netty.handler.timeout.IdleState;

import java.util.List;

public class Carti {

    public Integer id;
    public List denumire;
    public List autor;
    public Double pret;
    public Boolean reducere;

    public Carti(Integer ID, List Denumire, List Autor) {
        this.id = ID;
        this.denumire = Denumire;
        this.autor = Autor;
    }

    public Carti(Integer id, List denumire, List autor, Double pret, Boolean reducere) {
        this.id = id;
        this.denumire = denumire;
        this.autor = autor;
        this.pret = pret;
        this.reducere = reducere;
    }

    public void infoCarte(Integer id) {
        for (Integer i = 0; i < denumire.size(); i++) {
            for (Integer x = 0; x < autor.size(); x++) {
                if (autor.indexOf(autor.get(x)) == id && denumire.indexOf(denumire.get(i)) == id) {
                    System.out.println("Denumire cartii alea este " + denumire.get(i) + " de la autorul " + autor.get(x));
                }
            }
        }
    }


}
