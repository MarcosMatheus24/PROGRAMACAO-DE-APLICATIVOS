package ProjetoAluno;
import java.util.Scanner;
import ProjetoAluno.Aluno;
public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[5];
        System.out.println("Bem vindo ao Cadastro de Alunos");
        for(int i = 0; i < alunos.length; i++){
            alunos[i] = new Aluno();
            System.out.println("Informe o seu nome: ");
            alunos[i].setName(scanner.next());
            System.out.println("Informe sua idade");
            alunos[i].setIdade(scanner.nextInt());
            System.out.println("Informe sua Matricula");
            alunos[i].setMatricula(scanner.next());
        }
        System.out.println("Alunos Cadastrados");
        for(Aluno Pessoas: alunos){
            System.out.println("Nome: " + Pessoas.getName() + " idade: " + Pessoas.getIdade() + " Matricula: " + Pessoas.getMatricula());
        }
    }
}
