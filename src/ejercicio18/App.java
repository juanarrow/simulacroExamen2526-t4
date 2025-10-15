package ejercicio18;

public class App {
    public static void main(String[] args) {
        System.out.println("Introduzca un número de hasta 5 cifras: ");
        int numero = Integer.parseInt(System.console().readLine());
        int primera = 0;
        if(numero < 10)
            primera = numero;
        else if (numero < 100)
            primera = numero / 10;
        else if (numero < 1000)
            primera = numero / 100;
        else if (numero < 10000)
            primera = numero / 1000;
        else if (numero < 100000)
            primera = numero / 10000;
        else if (numero >=100000) {
            System.out.println("""
                El número introducido no es correcto.
                Introduzca un número de hasta 5 cifras.
                """);
        }
        if(numero < 100000)
            System.out.printf("La primera cifra es %s", primera);
            
    }
}
