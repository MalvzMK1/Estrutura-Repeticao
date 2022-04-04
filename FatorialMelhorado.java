import java.util.Scanner;

class FatorialMelhorado {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            while (true) {
                System.out.print("\nInforme um numero positivo: ");
                long n = sc.nextInt();
                long fat = n;
                if (n == 0) {
                        System.out.println(n + "! = 1");
                        break;
                    }
                if (n >= 0) {
                    for (int i = 2 ; i < n ; i++) {
                        fat *= i;
                    }
                    System.out.println(n + "! = " + fat);
                    break;
                }
                System.out.println("Somente numeros positivos");
            }
            System.out.println("\nDeseja continuar? [s/n]");
            char op = sc.next().charAt(0);

            if (op != 's' && op != 'y') {
                System.exit(0);
            }
        }
    }
}