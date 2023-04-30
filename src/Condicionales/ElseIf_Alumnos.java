package Condicionales;

import java.util.Scanner;

public class ElseIf_Alumnos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  nota;

        System.out.print("Ingrese la calificacion: ");
        nota = input.nextInt();
        
        if(nota <=10 & nota >=9){
            System.out.println("Su calificacion es una 'A'");
        }
        else if(nota <9 & nota >=8){
            System.out.println("Su calificacion es una 'B'");
        }
        else if(nota <8 & nota <=7){
            System.out.println("Su calificacion es una 'C'");
        }
        else if(nota <7 & nota >=6){
            System.out.println("Su calificacion es una 'D'");
        }
        else if(nota <6 & nota >=0){
            System.out.println("Su calificacion es una 'F'");
        }
        else{
            System.out.println("El valor ingresado no corresponde con los rangos");
        }

        }
    }
