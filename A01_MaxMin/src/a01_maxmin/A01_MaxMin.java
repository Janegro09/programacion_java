package a01_maxmin;
import java.util.Scanner;


public class A01_MaxMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int CANTIDAD = 5;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int suma = 0;
        int numero;
        
        for (int i = 0; i < CANTIDAD; i++) {
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();
            
            if (numero > max) max=numero;
            if (numero < min) min=numero;
            suma+=numero;
        };
        
        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);
        System.out.println("Promedio: " + suma / CANTIDAD);
        
        
        
    }
    
}
