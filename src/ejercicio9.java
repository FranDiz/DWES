import java.util.Scanner;

import static java.lang.Math.sqrt;

public class ejercicio9 {
    public static void main(String[] args) {
        System.out.println("La ecuación de segundo grado es  ax2 + bx + c = 0");
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce el valor de a");
        var a = escaner.nextInt();
        System.out.println("Introduce el valor de b");
        var b = escaner.nextInt();
        System.out.println("Introduce el valor de c");
        var c = escaner.nextInt();

        var b2 = Math.pow(b, 2);
        var raiz = sqrt(b2 - (4*a*c));

        System.out.println("Primera solución: \n " + (((-b) + raiz)/2*a));
        System.out.println("Segunda solución: \n " + (((-b) - raiz)/2*a));
    }
}
