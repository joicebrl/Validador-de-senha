import java.util.Scanner;

public class ValidadorDeSenha {
    public static void main(String[] args) {
        String senha = "";
        Scanner captura = new Scanner(System.in);

        do {
            boolean validacao = true;

            System.out.println("Digite uma senha: ");
            senha = captura.nextLine();

            if (!senha.matches(".{8,}")) {
                System.out.println("A senha deve ter 8 ou mais caracteres");
                validacao = false;
            }

            if (!senha.matches(".*[A-Z].*")) {
                System.out.println("A senha deve ter uma letra maiúscula");
                validacao = false;
            }

            if (!senha.matches(".*[a-z].*")) {
                System.out.println("A senha deve ter uma letra minúscula");
                validacao = false;
            }

            if (validacao == true) {
                break;
            }
        } while (true);

        captura.close();
        System.out.println("Senha aceita!");
    }
}