package ProjetoAluno;

public class Aluno {
    private String Nome;
    private int idade;
    private String Matricula;

    public Aluno(String Nome, int idade, String Matricula){
    this.Nome = Nome;
    this.idade = idade;
    this.Matricula = Matricula;
    }
    public void aniversario(){
        this.idade++;
    }
    public String getName(){
        return this.Nome;
    }
    public void setName(String Nome){
        this.Nome = Nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getMatricula(){
        return this.Matricula;
    }
    public void setMatricula(String Matricula){
        this.Matricula = Matricula;
    }
}
