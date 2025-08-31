package a09.a10_triangulos;
import java.util.Scanner;

public class A09A10_Triangulos {

    public static void main(String[] args) {
        int opcion;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una opción:");
        System.out.println("1. A9 triangulo rectangulo ");
        System.out.println("2. A10 triangulo ");
        opcion = sc.nextInt();
        
        if (opcion==1) {
            String estrella = ""; 
            for (int i = 0; i < 5; i++) {
                estrella= estrella +"*";
                System.out.println(estrella);
            }
        } else {
            String espacios="     ";
            String estrellas="*";

            for (int i = 0; i < 5; i++) {

                System.out.println(espacios + estrellas + espacios);
                estrellas="*"+estrellas+"*";
                espacios = espacios.substring(0, espacios.length() - 1);            
            }
        }
        
        
    }
    
}
