class Titulo {
    public static void main(String args[]) {
        String titulo = "Desenvolvimento de Sistemas - Turma DS1-M";
        char ch = '\u2588';

        for (int i = 51 ; i >= 1 ; i--) {
            System.out.print(ch);
        }
        System.out.println("\n" + ch + "    " + titulo + "    " + ch);
        for (int i = 51 ; i >= 1 ; i--) {
            System.out.print(ch);
        }
    }
}