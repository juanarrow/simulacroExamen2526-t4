package ejercicio5;

public class App {
    public static void main(String[] args) {        
        try {
            System.out.print("Por favor, introduzca la longitud de la base (cm): ");
            double base = Double.parseDouble(System.console().readLine());
            System.out.print("Introduzca la altura (cm): ");
            double altura = Double.parseDouble(System.console().readLine());
            System.out.printf("El área del rectángulo es %.1f cm2", base*altura);
        }
        catch(NumberFormatException e) {
            System.out.println("Error: Entrada no válida");
        }
        catch(Exception e) {
            System.out.println("Error inesperado");
        }
        
    }
}
