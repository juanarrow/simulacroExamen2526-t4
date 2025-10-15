public class App {

    public static void main(String[] args) throws Exception {                
        
        System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo):");
        int numero = Integer.parseInt(System.console().readLine());
        boolean capicua = false;
        if(numero < 10)
            capicua = true;
        if(!capicua && numero < 1000){
            int primer = numero / ((numero<100)?10:100);
            int ultimo = numero % 10;
            if(primer == ultimo)
                capicua = true;
        }
        if(!capicua && numero < 100000){
            int primer = numero / ((numero < 10000)? 1000: 10000);
            int segundo = (numero % ((numero < 10000)? 1000: 10000) / 
                                    ((numero < 10000)? 100: 1000));
            int ultimo = numero % 10;
            int penultimo = (numero / 10) % 10;
            if(primer == ultimo && segundo == penultimo)
                capicua = true;
        }
        System.out.printf("El número %s es capicúa%n", (capicua)?"":"no");
    }
}