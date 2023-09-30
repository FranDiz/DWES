package basicos;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce los euros que quieres convertir a pesetas");
        int euros = Integer.parseInt(miScanner.nextLine());
        System.out.println(euros * 166.386);
    }
}
