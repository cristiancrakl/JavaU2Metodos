public class Fizz_buzz {

    public void fizzRecorrer() {

        for (int i = 0; i <= 100; i++) {

            if ((i % 5 == 0) && (i % 3 == 0)) {

                System.out.println("fizzbuzz");

            } else {
                if (i % 3 == 0) {
                    System.out.println("fizz");
                }
                if (i % 5 == 0) {
                    System.out.println("buzz");

                } else {
                    System.out.println(i);
                }
            }

        }

    }

    public static void run() {

        Fizz_buzz run = new Fizz_buzz();
        run.fizzRecorrer();

    }

    public static void main(String[] args) {
        run();
    }

}
