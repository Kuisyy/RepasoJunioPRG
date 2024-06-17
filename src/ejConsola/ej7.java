package ejConsola;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;

public class ej7 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaCanvas cv = consola.getCapaCanvas();
        Teclado tec = consola.getTeclado();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension=tk.getScreenSize();
        int xMax = dimension.width;
        int ymax = dimension.height; 
        int xMitad = xMax/2-50;
        int yMitad = ymax/2-50;
        Graphics graphics = cv.getGraphics();
        graphics.setColor(Color.RED);
        graphics.drawLine(0,0,xMax,ymax);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(xMax,0,0,ymax);
        graphics.setColor(Color.YELLOW);
        graphics.drawOval(xMitad,yMitad,100,100);

        tec.leerCadenaCaracteres();

    }
}
