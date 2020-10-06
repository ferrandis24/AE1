package es.florida;

import java.util.ArrayList;

public class Act2 {
    public static void main(String[] args) {
        String[] array = {"Fran", "Borja", "Arnau", "David", "Ricardo", "Juan"};
        ArrayList nombre = new ArrayList();
        nombre.add("Fran");
        nombre.add("Borja");
        nombre.add("Arnau");
        nombre.add("David");
        nombre.add("Ricardo");
        nombre.add("Juan");
        for (Object s : nombre) {
            System.out.println(s);
        }
    }
}
