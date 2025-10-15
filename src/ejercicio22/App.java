package ejercicio22;

public class App {
    public static void main(String[] args) {
        int hastaViernesALasTresEnSegundos = 4*24*60*60 + 15*60*60;
        int hastaLunesEnSegundos = 7*24*60*60;
        System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
        String diaString = System.console().readLine().toLowerCase();
        int dia = switch(diaString.toLowerCase()) {
            case "lunes" -> 0;
            case "martes" -> 1;
            case "miércoles", "miercoles" -> 2;
            case "jueves" -> 3;
            case "viernes" -> 4;
            case "sábado", "sabado" -> 5;
            case "domingo" -> 6;
            default -> -1;
        };        
        if(dia == -1){
            System.out.println("El día introducido no es correcto.");
            return;
        }
        int diaEnSegundos = (dia) * 24 * 60 * 60;
        System.out.print("A continuación introduzca la hora (hora y minutos)");
        System.out.print("\nHora (0-23): ");
        int hora = Integer.parseInt(System.console().readLine());
        System.out.print("Minutos (0-59): ");
        int minutos = Integer.parseInt(System.console().readLine());
        diaEnSegundos += hora * 60 * 60 + minutos * 60;
        int diferencia = 0;
        if(diaEnSegundos > hastaViernesALasTresEnSegundos){
            diferencia = hastaLunesEnSegundos - diaEnSegundos + hastaViernesALasTresEnSegundos;
        }
        else
            diferencia = hastaViernesALasTresEnSegundos - diaEnSegundos;
        
            System.out.printf("Faltan %d segundos para el fin de semana%n", diferencia/60);
    }
}
