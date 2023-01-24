package ObiectConstructor;

import org.testng.annotations.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TelefonTest {

    @Test
    public void metodaTest(){

        List<String> caracateristici = new ArrayList<>();

        caracateristici.add("culoare mov");
        caracateristici.add("Camera 20 mp");
        caracateristici.add("Memorie 5gb");
        Telefon myPhone = new Telefon("Huawei", "Nova", 2014, "Android", caracateristici);
        myPhone.vechimeTelefon();

        List<String> caracterSamsung = Arrays.asList("Culoare neagra");

        Telefon myPhone2 = new Telefon("Samsung", "S22", 2022, "Android", caracateristici);
        //myPhone2.vechimeTelefon();
        //myPhone2.vanzareTelefon();

        Telefon myPhone3 = new Telefon("huawei", "Nova", 1400.00, Boolean.TRUE);
       // myPhone3.vanzareTelefon();

        //myPhone3.discounttelefon(10.00);
        myPhone2.vanzareTelefon();


    }


}
