package ProgramacionJava;

import java.util.*;

public class ColeccionesG155 {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList();
        miLista.add("CJ");
        miLista.add("Big Smoke");
        miLista.add("CJ");
        imprimir(miLista);

        /* Set<String> miSet = new HasdSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("100");*/
 /* Map<String, String> miMapa = new HasdMap();
       miMapa.put("1", "juan");
       miMapa.put("2", "Karla");*/
    }

    private static void imprimir(Collection<String> col) {
        for (String elemento : col) {
            System.out.println("elemento: " + elemento);
        }
        System.out.println("");

    }

}
