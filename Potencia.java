import java.util.Scanner;

class Potencia {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int base = 0;
        int expo = 0;

        while (true) {
            while (true) {
                System.out.print("\nInsira o valor da base: ");
                base = ler.nextInt();
                System.out.print("Insira o valor do expoente: ");
                expo = ler.nextInt();
                if (base >= 0 && expo >= 0) {
                    break;
                }
            }
            long pot = base;

            if (expo == 0) {
                System.out.println("\n" + base + " ^ " + expo + " = 1");
                break;
            }

            for (int i=1 ; i<expo ; i++) {
                pot = pot * base;
            }
            System.out.println("\n" + base + " ^ " + expo + " = " + pot);
            System.out.println("\nDeseja continuar? [s/n]");
            char op = ler.next().charAt(0);
            if (op != 's' && op != 'y') {
                System.exit(0);
            }
        }
    }
}