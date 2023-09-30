package entradaSalida;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int x = Integer.parseInt(miScanner.nextLine());
        System.out.println("Introduce el segundo numero");
        int y = Integer.parseInt(miScanner.nextLine());
        System.out.println("suma " + (x+y));
        System.out.println("resta " + (x-y));
        System.out.println("multiplicacion " + (x*y));
        System.out.println("division " + (x/y));
    }
}
