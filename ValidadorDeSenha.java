import java.util.Scanner;

public class ValidadorDeSenha {
    public static void main(String[] args) {
        String senha = "";
        Scanner scanner = new Scanner(System.in);

        do {
            boolean validacao = true;

            System.out.println("Digite uma senha: ");
            senha = scanner.nextLine();

            if (!senha.equals("batata")) {
                System.out.println("Você não digitou batata");
                validacao = false;
            }

            if (senha.equals("")) {
                System.out.println("Você não digitou uma senha");
                validacao = false;
            }

            if (validacao == true) {
                break;
            }
        } while (true);
    }
}