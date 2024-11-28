public class Aluno extends Pessoa{
    private double matricula;

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, int idade, double matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public String mensagem(){
        return "Nome: " + getNome() + ", idade: " + getIdade() + ", matricula: " + getMatricula();
    }
}
