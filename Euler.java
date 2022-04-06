import java.util.Scanner;

class Euler {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira um valor para o numero de Euler");
        double euler = ler.nextDouble();
        double aux = 1+1/euler;
        double cont = aux;

        while (euler != 1) {
            cont = aux * cont;
            euler--;
        }
        System.out.println(cont);
        /*euler = Math.pow((1 + 1/euler), euler);

        System.out.println(euler);*/
    }
}