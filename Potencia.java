import java.util.Scanner;

class Potencia {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Base: ");
        int base = ler.nextInt();
        System.out.print("Expoente: ");
        int expoente = ler.nextInt();
        int contador = base;
        
        // Base * base o tanto de vezes que o valor da potencia determina
        if (expoente <= 1) {
            System.out.println("1");
        }
        else {
            while (expoente != 1) {
                contador = base * contador;
                expoente--; 
            }
            System.out.println(contador);
        }
    }
}