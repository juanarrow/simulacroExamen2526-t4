package agenciadeviajes;

public class App {
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset
    // Regular Colors
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String RED = "\033[0;31m";     // RED

    public static void main(String[] args) {
        System.out.println("Dame la distancia entre A y B: ");
        int distAB = Integer.parseInt(System.console().readLine());
        System.out.print("Dame la distancia entre B y C: ");
        int distBC = Integer.parseInt(System.console().readLine());

        int transporteAB = Math.max(distAB, 500)==500?0:Math.max(distAB, 1000)==1000?1:2;
        int transporteBC = Math.max(distBC, 500)==500?0:Math.max(distBC, 1000)==1000?1:2;

        System.out.println(RESET);
        //primera parte
        System.out.printf("""
            A %s----%-20s(%d kms)----%s B %s----%-20s(%d kms)----%s C   
            
            """,
            switch(transporteAB){
                case 0 -> GREEN;
                case 1 -> YELLOW;
                case 2 -> RED;
                default -> "";
            },
            switch (transporteAB) {
                case 0->"Coche";
                case 1->"Tren";
                case 2->"Avión";
                default->"";
            },
            distAB,
            RESET,
            switch(transporteBC){
                case 0 -> GREEN;
                case 1 -> YELLOW;
                case 2 -> RED;
                default -> "";
            },
            switch (transporteBC) {
                case 0->"Coche";
                case 1->"Tren";
                case 2->"Avión";
                default->"";
            },
            distBC,
            RESET);
            System.out.println(RESET);

    }
}
