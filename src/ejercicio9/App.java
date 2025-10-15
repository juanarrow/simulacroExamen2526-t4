package ejercicio9;

public class App {
    public static void main(String[] args) {
        try{
            System.out.print("Por favor, introduzca la altura (cm): ");
            double altura = Double.parseDouble(System.console().readLine());            
            System.out.print("Introduzca el radio de la base (cm): ");
            double radio = Double.parseDouble(System.console().readLine());
            System.out.printf("El volumen del cono es de %f cm3", (1.0/3)*Math.PI*Math.pow(radio, 2)*altura);
        }
        catch(NumberFormatException e){
            System.out.println("Error: Entrada no válida");
        }
        catch(Exception e){
            System.out.println("Error inesperado");
        }
        
    }
}
