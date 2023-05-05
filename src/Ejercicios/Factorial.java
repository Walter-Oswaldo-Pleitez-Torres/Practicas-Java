package Ejercicios;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, factorial=1;
        
        System.out.print("Ingrese un numero para obtener su Factorial:");
        numero = input.nextInt();
        
        for(int i=numero; i>0; i--){//el valor del input se asigna a i para que se decremente
            factorial*=i; //factorial tiene valor 1 cuando multiplica al input y guarda el resultado.
            
            /*Los resultados se van multiplicando por el decremento del input y se van guardando en factorial*/
        }
        System.out.println("El factorial de "+numero+" es: "+factorial);
    }
}
