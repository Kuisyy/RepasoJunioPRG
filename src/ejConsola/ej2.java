package ejConsola;

import bpc.daw.consola.*;

public class ej2 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaTexto cTexto = consola.getCapaTexto();
        CapaFondo cfondo = consola.getCapaFondo();
        Teclado teclado = consola.getTeclado();

        cTexto.println("Indica el rgb que desee de fondo");
        cTexto.println("R:");
        int r = teclado.leerNumeroEntero();
        cTexto.println("G:");
        int g = teclado.leerNumeroEntero();
        cTexto.println("B:");
        int b = teclado.leerNumeroEntero();

        FondoColorSolido fondo = new FondoColorSolido(r,g,b);
        cfondo.setFondo(fondo);

        teclado.leerCadenaCaracteres();
    }
}
