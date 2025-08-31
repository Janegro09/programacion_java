import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
// public class 

class Calendario {
    private String nombre;
    public int tamanio;
    
    public Calendario(){
        tamanio=10;
        nombre="tuvi";
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String name){
        this.nombre = name;
    }
    
    public static long diasPasados(LocalDate fecha){
        LocalDate hoy = LocalDate.now();
        long dias = ChronoUnit.DAYS.between(fecha, hoy);
        return dias;
    }
}

public class ElTiempoPasa {
    //ver como hacer autocompeltado de main
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
    
        Calendario c = new Calendario();

        System.out.println(c.getNombre());
        
        /*    
        int dia;
        int mes;
        int anio;
    
        System.out.println("Ingrese un día: ");
        dia = sc.nextInt();
        System.out.println("Ingrese un mes: ");
        mes = sc.nextInt();
        System.out.println("Ingrese un año: ");
        anio = sc.nextInt();
        
        LocalDate fechaInicio = LocalDate.of(anio, mes, dia);
        
        long diasVividos = Calendario.diasPasados(fechaInicio);
        
        System.out.println("Pasaron: " + diasVividos + " dias");
*/
    }
}
