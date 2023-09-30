package entradaSalida;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce las pesetas que quieres convertir a euros");
        int pesetas = Integer.parseInt(miScanner.nextLine());
        System.out.println(pesetas/166.386);
    }
}
