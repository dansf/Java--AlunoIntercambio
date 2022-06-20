public class Estudante {
    private String nome;
    private int idade, matricula, anoCurso;
    private boolean podeViajar;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAnoCurso() {
        return anoCurso;
    }

    public void setAnoCurso(int anoCurso) {
        this.anoCurso = anoCurso;
    }

    Estudante(String nome, int idade, int matricula, int anoCurso, int anoPresente) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.anoCurso = anoCurso;
        this.podeViajar = definirPodeViajar(anoPresente);
    }

    Estudante() {
    }

    public String podeOuNaoViajar() {
        return this.podeViajar && (this.getIdade() >= 18) ? "Pode viajar!" : "Nao pode viajar!";
    }

    public boolean definirPodeViajar(int anoPresente) {
        return (anoPresente - this.getAnoCurso()) > 2 && (anoPresente - this.getAnoCurso()) < 10 ? true : false;
    }
}
