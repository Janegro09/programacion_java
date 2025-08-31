package a04_numerosperfectos;

public class A04_NumerosPerfectos {

    public static void main(String[] args) {
        int encontrados = 0;
        int numero = 2; 

        System.out.println("Los primeros 4 números perfectos son:");
        
        while (encontrados < 4) {
            int suma = 0;

            for (int i = 1; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    suma += i;
                }
            }

            if (suma == numero) {
                System.out.println(numero);
                encontrados++;
            }

            numero++;
        }
    }
}
