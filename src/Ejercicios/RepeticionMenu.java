package Ejercicios;

import java.util.Scanner;

public class RepeticionMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int continuar =1;
        int opcion=0;
        
        do{
            System.out.println("************* Bienevenido al menu Random *************");
            System.out.println("1)Operacion 1, 2)Operacion 2, 3)Operacion 3");
            opcion = input.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Area de Operacion 1");
                    System.out.println(" ");
                break;
                case 2:
                    System.out.println("Area de Operacion 2");
                    System.out.println(" ");
                break;
                case 3:
                    System.out.println("Area de Operacion 3");
                    System.out.println(" ");
                break;
                default:
                    System.out.println("El valor ingresado es invalido");
            }
            
            System.out.print("Si desea salir ingrese 1, si desea continuar ingrese otro numero: ");
            continuar = input.nextInt();
            
            if(continuar==1){
                System.out.println("Ud ha salido del programa");
                System.out.println(" ");
            }
            else{
                System.out.println("Ud sigue en el programa");
                System.out.println(" ");
            }
            
        }while(continuar!=1);
//Si no se modifica el valor de continuar, no seguirá iterando el bucle

    }
}
