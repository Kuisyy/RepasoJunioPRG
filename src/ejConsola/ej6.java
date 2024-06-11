package ejConsola;

import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ej6 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaTexto capaTexto = consola.getCapaTexto();
        try {
            capaTexto.setFont(Font.createFont(Font.TRUETYPE_FONT,new File("C:\\Users\\Kuisyy\\Downloads\\ASMAN.TTF")));
            capaTexto.println("Puta");
            Thread.sleep(10000);
        } catch (FontFormatException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
