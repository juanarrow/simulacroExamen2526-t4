package ejercicio24;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println("""
                    1 - Programador junior
                    2 - Prog. senior
                    3 - Jefe de proyecto
                    Introduzca el cargo del empleado (1 - 3):
                    """);
            String cargo = System.console().readLine();
            double sueldoBase = 950;
            if (cargo.length() != 1) {
                throw new NumberFormatException();
            }
            switch (cargo) {
                case "1":
                    sueldoBase = 950;
                    break;
                case "2":
                    sueldoBase = 1200;
                    break;
                case "3":
                    sueldoBase = 1600;
                    break;
                default:
                    throw new NumberFormatException();
            }
            System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
            int diasViaje = Integer.parseInt(System.console().readLine());
            if (diasViaje < 0) {
                diasViaje = 0;
            }
            double dietas = diasViaje * 30;
            System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
            String estadoCivil = System.console().readLine();
            if (estadoCivil.length() != 1) {
                throw new NumberFormatException();
            }
            int irpf = 25;
            switch (estadoCivil) {
                case "1" -> {
                    irpf = 25;
                }
                case "2" -> {
                    irpf = 20;
                    break;
                }
                default -> {
                    throw new NumberFormatException();
                }
            }
            System.out.printf(
                    """
                                -----------------------------------
                                | %-20s %10.2f |
                                | %-20s %10.2f |
                                |---------------------------------|
                                | %-20s %10.2f |
                                | %-20s %10.2f |
                                |---------------------------------|
                                | %-20s %10.2f |
                                -----------------------------------
                            """,
                    "Sueldo base", sueldoBase,
                    "Dietas ( " + diasViaje + " )", dietas,
                    "Sueldo bruto", (sueldoBase + dietas),
                    "Retención IRPF (" + irpf + "%)", (sueldoBase + dietas) * irpf / 100,
                    "Sueldo neto", (sueldoBase + dietas) - (sueldoBase + dietas) * irpf / 100);

        } catch (NumberFormatException e) {
            System.out.println("El valor introducido no es correcto.");
            return;
        } catch (Exception e){
            System.out.println("Ha ocurrido un error inesperado.");
            return;
        }
    }
}
