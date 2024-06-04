package Heranca;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar as informações do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu e-mail: ");
        String email = scanner.nextLine();

        System.out.print("Digite seu telefone: ");
        String telefone = scanner.nextLine();

        // Criar um objeto Usuario com as informações fornecidas
        Usuario usuario = new Usuario(nome, email, telefone);

        // Exibir as informações do usuário
        System.out.println("\nInformações do Usuário:");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Telefone: " + usuario.getTelefone());

        scanner.close();
    }
}
