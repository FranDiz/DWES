import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce la hora actual");
        var hora = escaner.nextInt();
        System.out.println("Introduce los minutos");
        var minutos = escaner.nextInt();
        var segundos = minutos*60 + hora*3600;

        System.out.println("Para el medio día faltan " + (86400-segundos));
    }
}
