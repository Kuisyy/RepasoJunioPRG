package tema3;

import recuperacion.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ej1 {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Random randomEdad = new Random();
        int edad;

        for (int i = 1; i < 201; i++) {
            do {
                edad=randomEdad.nextInt(1,13);

            }while (!(edad%2==0));
            String nombre= "persona"+i;
            personas.add(new Persona(nombre,edad));
            System.out.println("La persona "+nombre+" tiene "+edad+" años");

        }
    }
}
