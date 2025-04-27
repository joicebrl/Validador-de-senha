import java.util.Scanner;

public class ValidadorDeSenha {
    public static void main(String[] args) {
        String senha = "";
        Scanner scanner = new Scanner(System.in);

        do {
            boolean validacao = true;

            System.out.println("Digite uma senha: ");
            senha = scanner.nextLine();

            if (validacao == true) {
                break;
            }
        } while (true);
    }
}