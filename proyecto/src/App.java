import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese los numeros a ser sumados");

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        

        float Resultado = sumar(a, b);

        System.out.println(Resultado);

    }

    public static int sumar(int a, int b) {

        return a + b;

    }

    public static float sumar(float a,float b){

        return a+b;

    }

}
