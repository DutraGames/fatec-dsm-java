import java.util.Scanner;
import associacao.composicao.*;
import associacao.agregacao.*;

public class App {
    public static void main(String[] args) throws Exception {
        //ex1
        /* Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.print("Digite o seu cep: ");
        int cep = input.nextInt();

        System.out.print("Digite sua rua: ");
        String rua = input.next();

        System.out.print("Digite o seu numero: ");
        int numero = input.nextInt();

        System.out.print("Digite o complemento: ");
        String complemento = input.next();

        System.out.print("Digite o estado: ");
        String estado = input.next();

        System.out.print("Digite a cidade: ");
        String cidade = input.next();

        System.out.print("Digite o bairro: ");
        String bairro = input.next();

        Endereco end = new Endereco(cep, numero, bairro, estado, cidade, complemento, rua);

        Pessoa pessoa = new Pessoa(end, nome, idade);

        pessoa.mostrarEnd(); */

        //ex2

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome da disciplina: ");
        String nome = input.next();

        Disciplina disciplina = new Disciplina(nome);

        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Maria");

        disciplina.adicionarAluno(a1);
        disciplina.adicionarAluno(a2);

        disciplina.mostrarAlunos();










    }
}