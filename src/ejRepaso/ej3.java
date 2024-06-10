package ejRepaso;

import java.util.Random;

public class ej3 {
    public static void main(String[] args) {
        int contador=0;
        boolean centinela= false;
        while(centinela==false && contador<20){
            Random random = new Random();
            int n= random.nextInt(0,51);
            System.out.println(n);
            contador++;
            if (n==10 ||n==20 || n==30 ||n==40 || n==50){
                centinela=true;
            }
        }
        System.out.println("Hay: "+contador);
    }
}
