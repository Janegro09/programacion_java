
package a05_centrosnumericos;

import java.util.Scanner;

public class A05_CentrosNumericos {


    public static void main(String[] args) {
        
        int numero;
        int sumaIzq;
        int sumaDer;
        int totalDer;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
        
        for (int i = 0; i < numero; i++) {
            sumaIzq=0;
            sumaDer=i+1;
            totalDer=0;
            for (int j = 0; j < i; j++) {
                sumaIzq=sumaIzq + j;
            }
            
            while (sumaIzq > totalDer){
                totalDer+=sumaDer;
                sumaDer+=1;
            }
            
            if(sumaIzq==totalDer){
                System.out.println("i. "+i+": "+sumaIzq + "|" + totalDer);
            }
        }
        
        
    }
    
}
