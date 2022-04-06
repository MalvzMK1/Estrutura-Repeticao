import java.util.Scanner;

class Fatorial {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Número a ser fatorado: ");
        long num = ler.nextLong();
        long fat = num;

        if (num <= 1) {
            fat = 1;
            System.out.println(fat);
        }
        else {
            for (long i = num-1 ; i >= 2 ; i-=1) {
                fat *= i;
            }
            System.out.println(num + "! = " + fat);
        }
    }
}