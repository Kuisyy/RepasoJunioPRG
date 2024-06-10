package ejRepaso;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        boolean cent= false;

       while (cent==false){
           String palabras;
           System.out.println("Dime una palabra: ");
           palabras=new Scanner(System.in).nextLine();
           if (palabras.equals("fin")){
               cent=true;
           }
       }
    }
}
