package ejercicio3;

public class App {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la cantidad de pesetas que quiere convertir:");
        int pesetas = Integer.parseInt(System.console().readLine());
        System.out.printf("%d son %.2f euros", pesetas, pesetas/166.386);
        

    }
}
