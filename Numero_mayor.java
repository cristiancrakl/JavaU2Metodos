import java.util.Scanner;

public class Numero_mayor {

    public static void mayorNumero(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese tres numeros para saber cual es el mayor");
        double a =scanner.nextDouble();
        double b =scanner.nextDouble();
        double c  =scanner.nextDouble();
        
        double Numero_mayor=Math.max(a, Math.max(b, c));
        

         System.out.println("el numero mayor es: "+Numero_mayor);
    }

    public static void main(String[] args) {

        mayorNumero();

    }

}
