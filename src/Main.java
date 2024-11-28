import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa novaPessoa = new Pessoa("", 0);
        Aluno novoAluno = new Aluno("", 0, 0.0);

        System.out.print("nome da pessoa: ");
        novaPessoa.setNome(scanner.nextLine());

        System.out.print("idade da pessoa: ");
        novaPessoa.setIdade(scanner.nextInt());

        System.out.println(novaPessoa.mensagem());

        System.out.println("-----------------------------------------------------");

        System.out.print("nome do aluno: ");
        novoAluno.setNome(scanner.nextLine());
        scanner.nextLine();

        System.out.print("idade do aluno: ");
        novoAluno.setIdade(scanner.nextInt());

        System.out.print("matricula do aluno: ");
        novoAluno.setMatricula(scanner.nextInt());

        System.out.println(novoAluno.mensagem());
    }
}
