package ejRepaso;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        int n;
        System.out.println("Introduce un numero: ");
        n = new Scanner(System.in).nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.print("*");
        }
    }
}
