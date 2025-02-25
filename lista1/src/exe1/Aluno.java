package exe1;

public class Aluno {
    public String nome;
    public int nroAluno, idade;
    public float p1, p2;

    //Construtor sem parâmetro
    public Aluno(){
        this.nome = "nome indefinido";
    }
    public Aluno(int idade, int nroAluno, float p1, float p2, String nome) {
        this.idade = idade;
        this.nroAluno = nroAluno;
        this.p1 = p1;
        this.p2 = p2;
        this.nome = nome;
    }
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    public void dadosAluno(){
        System.out.println(" Nro Aluno:" + this.nroAluno + " Nome:" + this.nome + " P1:" + this.p1 + " P2:" + this.p2 + " Nota Final:" + this.notaFinal());

    }
    public String passou(){
        //Operador ternário
        return (this.notaFinal() >= 6) ? "Passou" : "Não Passou";
    }
}
