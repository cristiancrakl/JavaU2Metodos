import java.util.Scanner;

public class AreaFiguras {
    Scanner scanner = new Scanner(System.in);

    public void areaTriangulo() {

        System.out.println("ingrese la base del triangulo");
        double base = scanner.nextDouble();
        System.out.println("ingrese la altura del triangulo");
        double altura = scanner.nextDouble();

        double areaTriangulo = (base * altura) / 2;

        System.out.println("el area del triangulo es: " + areaTriangulo);
    }

    public void areaCuadrado() {
        System.out.println("ingrese un lado del cuadrado");
        double lado = scanner.nextDouble();
        double areaCuadrado = (lado * lado);

        System.out.println("el area del cuadrado es: " + areaCuadrado);
    }

    public void areaRectangulo() {
        System.out.println("ingrese la base del triangulo");
        double base = scanner.nextDouble();
        System.out.println("ingrese la altura del triangulo");
        double altura = scanner.nextDouble();
        double areaRectangulo = (base * altura);

        System.out.println("el area del rectangulo es: " + areaRectangulo);
    }

    public void salir() {
        System.out.println("saliendo de la calcuadora");
        scanner.close();
    }

    public void app() {
        while (true) {
            System.out.println("algoritmo calculadora de areas de figuras geometricas");

            System.out.println("Seleccione a continuacion a que figura geometrica le quiere saber el area");
            System.out.println("1.Triangulo ");
            System.out.println("2.cuadrado");
            System.out.println("3.rectangulo");
            System.out.println("4.salir");
            System.out.println();

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> areaTriangulo();
                case 2 -> areaCuadrado();
                case 3 -> areaRectangulo();
                case 4 -> {
                    salir();
                    return;
                }
                default -> System.out.println("ingrese una opcion valida");
            }
        }
    }

    public static void run() {

        AreaFiguras run = new AreaFiguras();
        run.app();

    }

    public static void main(String[] args) {
        run();

    }

}
