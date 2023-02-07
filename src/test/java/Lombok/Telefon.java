package Lombok;

import lombok.*;

@Getter //toate variabilele au get
@Setter // si set
@AllArgsConstructor //constructor cu toti parametrii / toate argumentele
@NoArgsConstructor //constructorul default, recomandat sa l punem si pe acesta daca vrem
@ToString //metoda sa reprezinta printr o metoda informatiile clasei (gen InfoTelefon)


public class Telefon {

    private String brand;
    private String model;
    private Integer anFabricatie;
    private String material;
    private String camera;

}
