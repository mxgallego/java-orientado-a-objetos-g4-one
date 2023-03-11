package co.edu.unicauca.appalura;

import java.util.ArrayList;
import java.util.Iterator;

public class clase2 {
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
        
        //for (int i = 0; i < lista.size(); i++) {
        	//System.out.println(lista.get(i));
		//}
        
       // for(String clase: lista) {
        //	 System.out.println(clase);
       // }
        
        lista.forEach(clase->System.out.println(clase));
        
    }
}
