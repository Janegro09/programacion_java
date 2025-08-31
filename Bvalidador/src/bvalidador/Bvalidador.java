package bvalidador;
import java.util.Scanner;

class Validadora {
    public static boolean validar(int valor, int min, int max){
        return valor <= max && valor >=min;
    }
}

public class Bvalidador {

    private static Scanner sc = new Scanner(System.in);

    public static void main2(String[] args) {
        
        final int CANT = 10;
        final int RANG_MAX = 100;
        final int RANG_MIN = -100;
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE; 
        int numero;
        double promedio;
        int suma = 0;
        boolean esValida = false;
        
        for (int i = 0; i < CANT; i++) {
            
            do {
                System.out.println("Ingrese un numero entre " + RANG_MIN + " y " + RANG_MAX + ": ");
                numero = sc.nextInt();            
                esValida = !Validadora.validar(numero, RANG_MIN, RANG_MAX);
                
                if (esValida) {
                    System.out.println("Error; numero fuera de rango");
                }                
            } while (esValida);
            
            if(true) {
                if (numero > max){
                    max = numero;
                }
                if (numero < min ){
                    min = numero;
                }
                
                suma+=numero;
            }
        }
        
        promedio = suma / CANT;
        System.out.println("El maximo es: " + max);
        System.out.println("El Minimo es: " + min);
        System.out.println("El promedio es: " + promedio);
    }
    
}
