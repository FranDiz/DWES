package arrays05;

import java.util.Random;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int array[] = new int[100];
        for (var i = 0;i<100;i++){
            int num = rand.nextInt(0, 500);
            array[i]=num;
        }
        Scanner escaner = new Scanner(System.in);
        System.out.println("¿Qué quieres destacar? -1 mínimo -2 mínimo");
        var destacar = escaner.nextInt();
        if (destacar == 2){
            var minimo = 501;
            for (var i = 0;i<array.length;i++){
                if (array[i]<minimo){
                    minimo=array[i];
                }
            }
            for (var i = 0;i<array.length;i++){
                if (array[i]==minimo){
                    System.out.println("**"+minimo+"**");
                }else{
                    System.out.println(array[i]);
                }

            }

        }
        if (destacar == 1){
            var maximo=-1;
            for (var i = 0;i<array.length;i++){
                if (array[i]>maximo){
                    maximo=array[i];
                }
            }
            for (var i = 0;i<array.length;i++){
                if (array[i]==maximo){
                    System.out.println("**"+maximo+"**");
                }else{
                    System.out.println(array[i]);
                }

            }

        }


    }
}
