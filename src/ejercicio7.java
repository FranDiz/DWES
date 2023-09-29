import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Introduce las 3 notas");
        Scanner escaner = new Scanner(System.in);
        var nota1 = escaner.nextInt();
        var nota2 = escaner.nextInt();
        var nota3 = escaner.nextInt();
        var media = (nota1+nota2+nota3)/3;
        System.out.println("La media es "+media);
    }
}
