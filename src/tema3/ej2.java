package tema3;

import recuperacion.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ej2 {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Random randomEdad = new Random();
        for (int i = 1; i < 6; i++) {
            personas.add(new Persona("persona" + i, randomEdad.nextInt(15, 71)));
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Persona personaJoven = null;
        Persona personaMayor = null;

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).edad()<min){
                personaJoven=personas.get(i);
                min = personaJoven.edad();
            }
        }
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).edad() >= max) {
                personaMayor = personas.get(i);
                max=personaMayor.edad();
            }
        }

        System.out.println("La persona mas joven es: " + personaJoven.nombre()+" "+personaJoven.edad());
        System.out.println("La persona mas mayor es: " + personaMayor.nombre()+" "+personaMayor.edad());

    }
}
