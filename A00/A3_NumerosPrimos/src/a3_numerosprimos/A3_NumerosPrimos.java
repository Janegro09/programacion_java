package a3_numerosprimos;
import java.util.Scanner;

public class A3_NumerosPrimos {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;
        int c=0;
        int primo = 1;
        System.out.println("Ingrese un numero");
        numero = sc.nextInt();
        
        for (int i = numero; i > 0; i--) {
            //System.out.println(i);
            c=0;
            for (int j = 1; j < i; j++) {
                if(i%j == 0) {
                    primo=j;
                    c++;
                  //  System.out.println("resto " + i + " " + j + " " + i%j);
                }
            }
            if(c<2){
                System.out.println("primo "+i);
            }
        }
        
        
    }
    
}
