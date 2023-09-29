import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Introduce un día de la semana");
        Scanner escaner = new Scanner(System.in);
        var dia = escaner.nextLine();
        switch (dia){
            case "lunes":
                System.out.println("A primera hora toca Empresas");
                        break;
            case "martes":
                System.out.println("A primera hora toca DWEC");
                break;
            case "miercoles":
                System.out.println("A primera hora toca DWES");
                break;
            case "jueves":
                System.out.println("A primera hora toca Despliegue");
                break;
            case "viernes":
                System.out.println("A primera hora toca Diseño");
                break;
            case "sabado":
                System.out.println("No hay clases");
                break;
            case "domingo":
                System.out.println("No hay clases");
                break;
        }
    }
}