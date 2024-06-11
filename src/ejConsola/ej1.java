package ejConsola;

import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;

import java.awt.*;

public class ej1 {
    public static void main(String[] args) {
        final int sg = 10000;
        Consola consola = new Consola();
        CapaTexto texto = consola.getCapaTexto();

        texto.setColorTexto(Color.red);
        texto.situarCursor(13,32);
        texto.println("Bienvenidos al instituto");

        try {
            Thread.sleep(sg);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
