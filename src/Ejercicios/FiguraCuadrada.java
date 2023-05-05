package Ejercicios;

import java.util.Scanner;

public class FiguraCuadrada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int columnas=0, filas=0;
        
        System.out.println("Ingrese el numero de filas: ");
        filas = input.nextInt();
        System.out.println("Ingrese el numero de columnas:");
        columnas = input.nextInt();
        
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
