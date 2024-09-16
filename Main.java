import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Criando listas para armazenar os grupos
    ArrayList<String> grupoMasculino = new ArrayList<>();
    ArrayList<String> grupoFeminino = new ArrayList<>();

    // Scanner para entrada de dados
    Scanner scanner = new Scanner(System.in);

    // Loop para receber os dados das pessoas
    while (true) {
      System.out.print("Digite o nome (ou 'sair' para finalizar): ");
      String nome = scanner.nextLine();

      // Se o usuário digitar 'sair', o loop é encerrado
      if (nome.equalsIgnoreCase("sair")) {
        break;
      }

      System.out.print("Digite o sexo (M para Masculino, F para Feminino): ");
      String sexo = scanner.nextLine();

      // Adicionando o nome à lista correspondente
      if (sexo.equalsIgnoreCase("M")) {
        grupoMasculino.add(nome);
      } else if (sexo.equalsIgnoreCase("F")) {
        grupoFeminino.add(nome);
      } else {
        System.out.println("Sexo inválido. Tente novamente.");
      }
    }

    // Exibindo os grupos
    System.out.println("\nGrupo Masculino:");
    for (String pessoa : grupoMasculino) {
      System.out.println(pessoa);
    }

    System.out.println("\nGrupo Feminino:");
    for (String pessoa : grupoFeminino) {
      System.out.println(pessoa);
    }

    // Fechando o scanner
    scanner.close();
  }
}
