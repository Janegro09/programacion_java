package a06_bissextus;
import java.util.Scanner;

public class A06_BisSextus {

    public static void main(String[] args) {
        int anioInicio;
        int anioFin;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresá un año de inicio:");
        anioInicio = sc.nextInt();
        System.out.println("Ingresá un año de fin:");
        anioFin = sc.nextInt();
        
        for (int i = anioInicio; i <= anioFin; i++) {
            if(i%400==0 || (i%4 == 0 && i%100!=0)){
                System.out.println(i + " es año biciesto");
            }
        }
    }
    
}
