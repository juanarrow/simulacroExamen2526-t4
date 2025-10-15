package ejercicio23;

public class App {
    public static void main(String[] args) {
        try {
            System.out.print(
                    """
                    Introduzca la base imponible: """);
            double base = Double.parseDouble(System.console().readLine());
            System.out.print(
                    """
                    Introduzca el tipo de IVA (general, reducido o superreducido): """);
            String tipoIva = System.console().readLine();
            int iva = switch (tipoIva.toLowerCase()) {
                case "general" -> 21;
                case "reducido" -> 10;
                case "superreducido" -> 4;
                default -> -1;
            };
            if (iva == -1) {
                tipoIva = "general";
                iva = 21;
            }
            double parteIva = (base * iva / 100);
            double precioConIva = base + parteIva;
            System.out.print(
                    """
                    Introduzca el código promocional (nopro, mitad, meno5 o 5porc): """);
            String codPromo = System.console().readLine();
            double valorPromo = 0;
            switch (codPromo.toLowerCase()) {
                case "nopro" -> {
                }
                case "mitad" -> {
                    valorPromo = precioConIva / 2;
                }
                case "meno5" -> {
                    valorPromo = precioConIva - 5;
                }
                case "5porc" -> {
                    valorPromo = precioConIva * 0.05;
                }
                default -> {
                    System.out.println("El código promocional introducido no es correcto.");
                    valorPromo = 0;
                    codPromo = "nopro";                    
                }
            }
            System.out.printf("""
                    %-21s%6.2f
                    %-21s%6.2f
                    %-21s%6.2f
                    %-21s%6.2f
                    %-21s%6.2f
                    """,
                    "Base imponible", base,
                    "IVA (" + iva + "%)", parteIva,
                    "Precio con IVA", precioConIva,
                    "Cod. promo. (" + codPromo + ")", -valorPromo,
                    "Total", precioConIva - valorPromo);

        } catch (NumberFormatException e) {
            System.out.println("El valor introducido no es correcto.");
            return;
        }

    }
}
