import java.util.Scanner;

class Fibonacci {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantidade de valores para Fibonacci: ");
        int qtd = ler.nextInt();
        if (qtd < 2) {
            System.out.print("1");
            System.exit(0);
        }
        long n1 = 1;
        long n2 = 1;
        System.out.print("1\n1\n");

        for (int i=0 ; i<qtd-2 ; i++) {
            long n3 = n1 + n2;
            System.out.print(n3 + "\t\t");
            System.out.print("**" + (double)n2/n1 + "\n");
            n1 = n2;
            n2 = n3;
        }
    }
}