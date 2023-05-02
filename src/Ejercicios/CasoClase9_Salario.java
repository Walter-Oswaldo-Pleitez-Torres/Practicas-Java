package Ejercicios;

import java.util.Scanner;

public class CasoClase9_Salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double horas=0, precioHora=15, salario;
        String nombre;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese las horas trabajadas: ");
        horas = input.nextInt();
        
        if(precioHora <= 40){
            salario = precioHora * horas;
            System.out.println("Nombre: "+nombre+", Salario: "+salario);
        }
        else if(precioHora >40){
            //No funciona el calculo
            salario = 40 * precioHora + 1.5 * precioHora * (horas - 40);
            System.out.println("Nombre: "+nombre+", Salario: "+salario);
        }
    }
}
