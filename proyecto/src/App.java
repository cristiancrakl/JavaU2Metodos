import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        App calculadora=new App();

        System.out.println(calculadora.sumar(4.1, 2.3));
        System.out.println(calculadora.sumar(2, 4));

    }

    public static int sumar(int a, int b) {

        return a + b;

    }

    public static double sumar(double a,double b){

        return a+b;

    }

}
