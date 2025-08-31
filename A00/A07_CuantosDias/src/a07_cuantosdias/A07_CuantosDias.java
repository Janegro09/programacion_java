package a07_cuantosdias;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
        
public class A07_CuantosDias {

    public static void main(String[] args) {
        int dia;
        int mes;
        int anio;
        LocalDate nacimiento;
        long diasVividos;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuántos días viviste?");
        System.out.println("Ingresá tu día de nacimiento:");
        dia= sc.nextInt();
        System.out.println("Ingresá tu mes de nacimiento:");
        mes=sc.nextInt();
        System.out.println("Ingresá tu año de nacimiento:");
        anio=sc.nextInt();
        nacimiento = LocalDate.of(anio,mes,dia);
        diasVividos = ChronoUnit.DAYS.between(nacimiento, LocalDate.now());
        System.out.println("Viviste " + diasVividos);
        
    }
    
}
