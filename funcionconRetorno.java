import java.util.Scanner;

public class funcionconRetorno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mayor = encontrarMayor(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("El número mayor es: " + mayor);
    }

    public static int encontrarMayor(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}