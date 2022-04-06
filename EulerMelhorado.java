import java.util.Scanner;

class EulerMelhorado {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira um valor para o numero de Euler");
        double euler = ler.nextDouble();
        double aux = 1+1/euler;
        double cont = aux;

        System.out.println("Até qual valor você quer que mostre?");
        double quant = ler.nextDouble();

        for (double i = quant ; i >= 1 ; i--) {
            while (euler != 1) {
                cont = aux * cont;
                euler--;
            }
            System.out.println(cont);
            cont++;
        }
    }
}