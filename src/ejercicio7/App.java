package ejercicio7;

public class App {
    public static void main(String[] args) {
        try{
            System.out.print("Por favor, introduzca la base imponible (precio del artículo sin IVA): ");
            double baseImponible = Double.parseDouble(System.console().readLine());
            double iva = 0.21*baseImponible;
            System.out.printf("""
                %-18s%5.2f $
                %-18s%5.2f $
                -------------------------
                %-18s%5.2f $
                    """, 
                    "Base imponible", baseImponible,
                    "IVA (21%)", iva,
                    "Total", baseImponible + iva);

        }
        catch(NumberFormatException e){
            System.out.println("Error: Entrada no válida");
        }
        catch(Exception e){
            System.out.println("Error inesperado");
        }    
        
    }    
}
