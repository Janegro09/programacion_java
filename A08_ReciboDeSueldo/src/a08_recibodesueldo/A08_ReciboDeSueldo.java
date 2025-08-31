package a08_recibodesueldo;
import java.util.Scanner;

public class A08_ReciboDeSueldo {

    public static void main(String[] args) {
        int valorHora;
        String nombre = null;
        int antiguedad;
        int cantHoras;
        double total;
        Scanner sc = new Scanner(System.in);
        double totalNeto;
        int cantEmpleados;
        System.out.println("Ingrese la cantidad de empleados");
        cantEmpleados = sc.nextInt();
        
        System.out.println("**************sueldos**************");
        for (int i = 0; i < cantEmpleados; i++) {
            
        
            System.out.println("valor hora:");
            valorHora=sc.nextInt();
            System.out.println("Ingrese el nombre:");
            nombre= sc.next();       
            System.out.println("Antiguedad:");
            antiguedad=sc.nextInt();
            System.out.println("Cantidad de horas trabajadas:");
            cantHoras = sc.nextInt();
            total = valorHora*cantHoras+antiguedad*51000;
            totalNeto = total * 0.87;
            
            System.out.println("******Recibo******");
            System.out.println("Nombre:     " + nombre);
            System.out.println("Antiguedad:     " + antiguedad + "años");
            System.out.println("Valor hora:     " + valorHora);
            System.out.println("Bruto:      " + total);
            System.out.println("Neto:       " + totalNeto);
        }
        
        
        
    }
    
}
