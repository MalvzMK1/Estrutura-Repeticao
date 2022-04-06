import java.util.Scanner;

class Euler {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira um valor para o numero de Euler");
        double num = ler.nextDouble();

        double euler = Math.pow((1 + 1/num), num);

        System.out.println(euler);
    }
}