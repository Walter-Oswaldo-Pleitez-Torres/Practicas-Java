package Ejercicios;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int filas;
        int columnas;

        System.out.println("Ingrese la cantidad de filas: ");
        filas = input.nextInt();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

    }
}
