import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        System.out.println("La ecuación de primer grado es  ax + b = 0 \n Introduce el valor  a");
        Scanner escaner = new Scanner(System.in);
        var a = escaner.nextInt();
        System.out.println("Introduce el valor b");
        var b = escaner.nextInt();
        System.out.println("Introduce el valor a la derecha del igual");
        var numero = escaner.nextInt();
        System.out.println("x = "+ ((numero-b)/a));
    }
}
