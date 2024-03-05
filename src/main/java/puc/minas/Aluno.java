package main.java.puc.minas;

public class Aluno {
    private int frequencia;
    private int notaFinal;
    private int notaEspecial;

    public Aluno(int frequencia, int notaFinal, int notaEspecial) {
        this.frequencia = frequencia;
        this.notaFinal = notaFinal;
        this.notaEspecial = notaEspecial;
    }
    public String determinarAprovacao() {
        return "";
    }
}
