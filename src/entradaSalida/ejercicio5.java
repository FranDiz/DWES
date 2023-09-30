package entradaSalida;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce la altura");
        int altura = Integer.parseInt(miScanner.nextLine());
        System.out.println("Introduce la base");
        int base = Integer.parseInt(miScanner.nextLine());
        System.out.println("El área del rectángulo es " + altura*base + "m cuadrados");
    }
}
