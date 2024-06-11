package ejConsola;

import bpc.daw.consola.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ej4 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaFondo capaFondo = consola.getCapaFondo();
        CapaTexto capaTexto = consola.getCapaTexto();
        Teclado teclado = consola.getTeclado();

        FondoColorSolido fondoColorSolido = new FondoColorSolido(Color.BLUE);
        capaFondo.setFondo(fondoColorSolido);
        capaTexto.setColorTexto(Color.yellow);
        capaTexto.println("Introduzca la ruta de una imagen: ");
        String ruta =teclado.leerCadenaCaracteres();

        try {
            BufferedImage bf = ImageIO.read(new File(ruta));
            FondoImagen fondo = new FondoImagen(bf);
            fondo.setEscalado(true);
            capaFondo.setFondo(fondo);
            teclado.leerCadenaCaracteres();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
