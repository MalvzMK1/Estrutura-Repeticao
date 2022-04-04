import java.util.Scanner;

class AutentSistema {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        String usuarioCadastrado = "Sonia";
        String senhaCadastrada = "abc123def456";
        int rep = 1;
        
        while (rep < 4) {
            for (int i = 1 ; i < 3 ; i++) {
                System.out.println("\nUsuário: ");
                String usuarioInserido = ler.next();

                if (!usuarioInserido.equals(usuarioCadastrado)) {
                    System.out.println("Usuario incorreto");
                    rep++;
                    break;
                }

                System.out.println("\nSenha: ");
                String senhaInserida = ler.next();

                if (!senhaInserida.equals(senhaCadastrada)) {
                    System.out.println("Senha incorreta");
                    rep++;
                    break;
                }
                else {
                    System.out.println("Bem-vindo(a)!");
                    System.exit(0);
                }
            }
        }
    }
}