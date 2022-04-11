import java.util.Scanner;

class Primo {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira um número menor ou igual a 2: ");
        int num = ler.nextInt();

        for (int i=2 ; i<num/2+1 ; i++) {
            if (num % i == 0) {
                System.out.println("Não eh primo");
                System.exit(0);
            }
        }
        System.out.println("\n" + num + " eh primo.");
    }
}