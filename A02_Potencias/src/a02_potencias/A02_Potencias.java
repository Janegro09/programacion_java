package a02_potencias;
import java.util.Scanner;

public class A02_Potencias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        boolean fin = false;
        
        while (!fin){
            
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();

            if( numero > 0 ) {
                fin = true; 
                System.out.println("El cuadrado es: " + Math.pow(numero,2));
                System.out.println("El cubo es: " + Math.pow(numero, 3));
           } else {
                System.out.println("Error, reingresar: " );
            }
            System.out.println("El cuadrado");
        }

    }
    
}
