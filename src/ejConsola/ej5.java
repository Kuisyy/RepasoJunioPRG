package ejConsola;

import bpc.daw.consola.*;

import java.awt.*;

public class ej5 {
    public static void main(String[] args) {
        Consola consola = new Consola("Ejercicio 5",640,480);
        CapaCanvas cv = consola.getCapaCanvas();

        Graphics graphics = cv.getGraphics();
        graphics.setColor(Color.CYAN);
        graphics.fillRect(0,0,640,400);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(0,400,640,80);
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(120,90,120,90);

//        Graphics recVerde = cv.getGraphics();
//        recVerde.setColor(Color.GREEN);
//        recVerde.fillRect(0,400,640,80);
//
//        Graphics sol = cv.getGraphics();
//        sol.setColor(Color.YELLOW);
//        sol.fillOval(120,90,120,90);


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
