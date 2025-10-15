package ejercicio19;

public class App {
    public static void main(String[] args) {
        System.out.println("Introduzca un número de hasta 5 cifras positivo o negativo: ");
        int numero = Integer.parseInt(System.console().readLine());
        numero = Math.abs(numero);
        int cifras = 0;
        if(numero < 10)
           cifras = 1;
        else if (numero < 100)
           cifras = 2;
        else if (numero < 1000)
           cifras = 3; 
        else if (numero < 10000)
           cifras = 4; 
        else if (numero < 100000)
           cifras = 5;
        else        
            System.out.println("""
                El número introducido no es correcto.
                Introduzca un número de hasta 5 cifras.
                """);
        System.out.printf("El número tiene %d cifras", cifras);
    }
}
