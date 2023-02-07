package Lombok;

import org.testng.annotations.Test;

public class TelefonTest {


    @Test
    public void metodaTest(){
        Telefon huawei = new Telefon("Huawei", "nova", 2021, "metal", "20px");
        System.out.println(huawei.getAnFabricatie());
        System.out.println(huawei.getBrand());
        huawei.setCamera("excelenta");

        System.out.println(huawei);

    }


}
