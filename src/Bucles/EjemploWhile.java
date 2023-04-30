package Bucles;

import java.util.Scanner;

public class EjemploWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 1, numeroSecreto = 7, numero;

        System.out.println("Bienvenido al juego de adivinacion del numero secreto");

        while (contador < 5) {
            System.out.print("Ingrese un numero: ");
            numero = input.nextInt();

            if (numero == numeroSecreto) {
                System.out.println("Felicidades ud adivino el numero secreto: ");
                break;
            } else {
                System.out.println("Incorrecto!");
                System.out.println("Le quedan: " + (5 - contador) + " intentos");
            }

            contador++;
        }

    }
}
