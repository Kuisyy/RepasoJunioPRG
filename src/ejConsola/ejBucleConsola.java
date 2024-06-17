package ejConsola;

import bpc.daw.consola.*;

import java.awt.*;

public class ejBucleConsola {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaTexto capaTexto = consola.getCapaTexto();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        CapaFondo capaFondo = consola.getCapaFondo();
        Teclado teclado = consola.getTeclado();
        final int ANCHO = 400;

        capaFondo.setFondo(new FondoColorSolido(Color.WHITE));

        capaTexto.setColorTexto(Color.BLACK);
        capaTexto.situarCursor(0,2);
        capaTexto.print("Introduzca el numero de segundos : ");
        int sg = teclado.leerNumeroEntero();
        Graphics gr = capaCanvas.getGraphics();
        gr.setColor(Color.BLACK);
        gr.drawRect(50,100,ANCHO,20);
        int calculo = ANCHO/sg;

        for (int i = 0; i < sg; i++) {
            gr.setColor(Color.BLUE);
            gr.fillRect(50,100,calculo,20);
            calculo+=calculo;

            capaTexto.situarCursor(4,2);
            capaTexto.println("Esperando finalizacion...("+i+" seg de "+sg);
        }


        teclado.leerCadenaCaracteres();
    }
}
