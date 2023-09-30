package entradaSalida;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int n1 = Integer.parseInt(escaner.nextLine());
        System.out.println("Introduce el segundo numero");
        int n2 = Integer.parseInt(escaner.nextLine());
        System.out.println(n1*n2);
    }
}
