package arrays05;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int numeros[]= new int[8];
        for (var i = 0;i<8;i++){
            System.out.println("Introduce un número");
            var numero = escaner.nextInt();
            numeros[i]=numero;
        }
        for (var i = 0;i< numeros.length;i++){
            if (numeros[i]%2 == 0){
                System.out.println(numeros[i] + " par");
            }else{
                System.out.println(numeros[i] + " impar");
            }
        }
    }
}
