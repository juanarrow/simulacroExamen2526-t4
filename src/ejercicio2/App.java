package ejercicio2;

public class App {
    public static void main(String[] args) {                
        System.out.print("Por favor, introduzca la cantidad de euros que quiere convertir: ");
        double euros = Double.parseDouble(System.console().readLine());
        System.out.printf("%.2f euros son %d pesetas", euros, (int)Math.round(euros*166.386));
    }
}
