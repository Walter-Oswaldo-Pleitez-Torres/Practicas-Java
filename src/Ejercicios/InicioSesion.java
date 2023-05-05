package Ejercicios;

import java.util.Scanner;

public class InicioSesion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usuario = "Walter", user="";
        String password =  "12345", pwd="";
        int intentos = 0;
        
        do{
            System.out.println("Ingrese usuario: ");
            user = input.nextLine();
            System.out.println("Ingrese clave: ");
            pwd = input.nextLine();
            
            if(user.equals(user) && pwd.equals(password)){
                System.out.println("ACCESO CONCEDIDO");
                break;
            }
            else{
                System.out.println("ACCESO DENEGADO");
                System.out.println("Le quedan "+(2-intentos)+" Intentos.");
            }
            
            System.out.println("****************************");
            
            intentos++;
        }while(intentos<3);
        
    }
}
