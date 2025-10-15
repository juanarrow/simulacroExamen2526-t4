package tiendavideojuegos;

public class App {
    public static void main(String[] args) throws InterruptedException {
        
        String titulo = "GAME WORLD. Tu tienda Gamer";
        int longitud = titulo.length();
        System.out.printf(
        """
        ╔════════════════════════════════════════╗
        ║%s║
        ╚════════════════════════════════════════╝                    
        """,String.format("%"+Math.ceil(((double)40-longitud)/2)+"s%s%"+Math.floor(((double)40-longitud)/2)+"s","",titulo,""));
        System.out.print("Introduce tu nombre: ");
        String nombre = System.console().readLine();
        System.out.print("Introduce tu edad: ");
        int edad = Integer.parseInt(System.console().readLine());
        System.out.print("Cuánto dinero tienes disponible: ");
        double dinero = Double.parseDouble(System.console().readLine());
        System.out.print("¿Eres miembro VIP? (true/false): ");
        String vip = System.console().readLine();

        titulo = "CATALOGO DE VIDEOJUEGOS";
        longitud = titulo.length();
        System.out.println("──────────────────────────────────────────");
        System.out.printf("%"+Math.ceil((40.0 - longitud)/2)+"s%s%"+Math.floor((40.0 - longitud)/2)+"s%n","", titulo,"");
        System.out.println("──────────────────────────────────────────");

        int idJuego1 = 1;
        String nombreJuego1 = "Aventura Épica";        
        double precioJuego1 = 59.99; 
        boolean mayoresJuego1 = false;

        int idJuego2 = 2;
        String nombreJuego2 = "Carreras Extremas";                
        double precioJuego2 = 49.99; 
        boolean mayoresJuego2 = true;


        int idJuego3 = 3;
        String nombreJuego3 = "Puzle Master";                
        double precioJuego3 = 29.99;
        boolean mayoresJuego3 = false; 

        int idJuego4 = 4;
        String nombreJuego4 = "Acción Total";                
        double precioJuego4 = 69.99; 
        boolean mayoresJuego4 = true;


        System.out.printf("""
                %d. %-20s - $%5.2f
                %d. %-20s - $%5.2f
                %d. %-20s - $%5.2f
                %d. %-20s - $%5.2f
                """,
                idJuego1, (edad<18 && mayoresJuego1)?"*****":nombreJuego1, precioJuego1,
                idJuego2, (edad<18 && mayoresJuego2)?"*****":nombreJuego2, precioJuego2,
                idJuego3, (edad<18 && mayoresJuego3)?"*****":nombreJuego3, precioJuego3,
                idJuego4, (edad<18 && mayoresJuego4)?"*****":nombreJuego4, precioJuego4
        );

        System.out.println("Selecciona un juego: ");
        int seleccion = Integer.parseInt(System.console().readLine());        
        String seleccionNombre = "";
        int seleccionId = 0;
        double seleccionPrecio = 0.0;

        switch(seleccion){
            case 1:
                seleccionNombre = nombreJuego1;
                seleccionId = idJuego1;
                seleccionPrecio = precioJuego1;
                if(mayoresJuego1 && edad<18){
                    System.out.println("No tienes la edad suficiente para comprar este juego.");
                    return;
                }
                break;
            case 2:
                seleccionNombre = nombreJuego2;
                seleccionId = idJuego2;
                seleccionPrecio = precioJuego2;
                if(mayoresJuego2 && edad<18){
                    System.out.println("No tienes la edad suficiente para comprar este juego.");
                    return;
                }
                break;

            case 3:
                seleccionNombre = nombreJuego3;
                seleccionId = idJuego3;
                seleccionPrecio = precioJuego3;
                if(mayoresJuego3 && edad<18){
                    System.out.println("No tienes la edad suficiente para comprar este juego.");
                    return;
                }
                break;
            case 4:
                seleccionNombre = nombreJuego4;
                seleccionId = idJuego4;
                seleccionPrecio = precioJuego4;
                if(mayoresJuego4 && edad<18){
                    System.out.println("No tienes la edad suficiente para comprar este juego.");
                    return;
                }
                break;
            default:  
                System.out.println("La opción seleccionada no es correcta.");              
                return;
        }

        if(seleccionPrecio > dinero)
        {
            System.out.println("No tienes suficiente dinero para comprar este juego.");
            return;
        }

        System.out.println("Has seleccionado: " + seleccionNombre);

        double descuentoVIP = switch(vip){
            case "true" -> 0.15;
            case "false" -> 0.0;
            default -> {
                System.out.println("El valor introducido no es correcto.");
                yield -1.0;
            }
        };

        double descuentoMenor = (edad < 18) ? 0.10 : 0.0;
        double precioConDtoVIP = seleccionPrecio*descuentoVIP;
        double precioConDtoMenor = seleccionPrecio*descuentoMenor;
        double total = seleccionPrecio - precioConDtoVIP - precioConDtoMenor;
        Thread.sleep((int)(Math.random()*2000 + 3000));
        if(Math.random()>0.1){
            System.out.println("Fallo en el sistema de cobro");
            return;
        }
        System.out.println("RESUMEN DE LA COMPRA");
        System.out.println("──────────────────────────────────────────");
        System.out.printf("""
        %-20s%5.2f
        %-20s%5.2f                        
        %-20s%5.2f
        ──────────────────────────────────────────
        %-20s:%5.2f
        ──────────────────────────────────────────
        """,
        "Precio original:", seleccionPrecio,
        "Descuento VIP ("+(descuentoVIP*100)+"%):", precioConDtoVIP,
        "Descuento Menor ("+descuentoMenor*100+"):", precioConDtoMenor,
        "Precio final:", total);
        
        System.out.println("Estado: Compra exitosa");
        System.out.printf("Tu cambio: %.2f%n",(dinero - total));
        System.out.printf("Puntos de fidelidad ganados: %d%n", Math.round(total));
        System.out.printf("Categoría de cliente: %s%n", (edad<18)?"Adolescente":"Adulto");                
        System.out.println("¿Gracias por tu compra!");
    }    
}
