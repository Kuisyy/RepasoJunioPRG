package ejConsola;

import bpc.daw.consola.CapaFondo;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Fondo;
import bpc.daw.consola.FondoImagen;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class ej3 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaFondo cFondo = consola.getCapaFondo();
        try {
            BufferedImage bf = ImageIO.read(new File("C:\\Users\\Kuisyy\\Downloads\\RepasoJunioPRG\\src\\ejConsola\\fondoImagen.jpeg"));
            FondoImagen fondoImagen = new FondoImagen(bf);

            cFondo.setFondo(fondoImagen);
            Thread.sleep(10000);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
