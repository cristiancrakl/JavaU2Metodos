import java.util.Scanner;

public class Numero_mayor {
    
    Scanner scanner=new Scanner(System.in);

    
    
    public static int mayorNumero(int a,int b, int c){

        return Math.max(a, Math.max(b, c));

    }
    
    
    public static void main(String[] args) {
        int mayor= mayorNumero(1,2,3);
        System.out.println("el numeor mayor es "+mayor);

        
    }

}
