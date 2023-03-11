package co.edu.unicauca.appalura;

import java.util.ArrayList;

/**
 *
 * @author MXGALLEGO
 */
public class AppAlura {

    public static void main(String[] args) {
        String variable1 = "ejemplo 1";
        String variable2 = "ejemplo 2";
        String variable3 = "ejemplo 3";
        String variable4 = "ejemplo 4";
        
        ArrayList<String> lista = new ArrayList<>();
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);
        
        System.out.println(lista);
        
        //lista.remove(2);
        //lista.set(2, "Ejemplo alterado");
        
        
        System.out.println(lista.size());
        
        
        
    }
}
