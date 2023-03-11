package co.edu.unicauca.appalura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3 {
	public static void main(String[] args) {
        String curso1 = "Geometria";
        String curso2 = "Fisica";
        String curso3 = "Quimica";
        String curso4 = "Historia";
        
        ArrayList<String> curso = new ArrayList<>();
        curso.add(curso1);
        curso.add(curso2);
        curso.add(curso3);
        curso.add(curso4);
        
        System.out.println(curso);
        Collections.sort(curso);
        System.out.println(curso);
        Collections.sort(curso,Collections.reverseOrder());
        System.out.println(curso);
        curso.sort(Comparator.reverseOrder());
        System.out.println(curso);
        
        curso.sort(Comparator.naturalOrder());
        System.out.println(curso);
        List<String> cursoslist = curso.stream().sorted().collect(Collectors.toList());
        System.out.println(cursoslist);
        //for (int i = 0; i < lista.size(); i++) {
        	//System.out.println(lista.get(i));
		//}
        
       // for(String clase: lista) {
        //	 System.out.println(clase);
       // }
        
       // curso.forEach(clase->System.out.println(clase));
        
    }
}
