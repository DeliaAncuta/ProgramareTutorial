package Tema;

import io.netty.util.concurrent.SingleThreadEventExecutor;
import org.testng.annotations.Test;

public class Tema2Bonus {


    @Test
    public void metodaTest(){
        comparamSuma(3,2,9);

    }

    public Integer comparamSuma(Integer num1, Integer num2, Integer num3){
        Integer suma = num1 + num2;
        if(suma>num3){
            System.out.println("Suma primelor doua numere este "+ suma + " si este mai mare decat al treile numar introdus");
        }else{
            System.out.println("Suma primelor doua numere este "+ suma + " si este mai mica decat al treile numar introdus");
        }
        return suma;
    }

}
