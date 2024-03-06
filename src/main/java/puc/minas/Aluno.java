package main.java.puc.minas;

public class Aluno {
    private double frequencia;
    private double notaFinal;
    private double notaEspecial;

    public Aluno(double frequencia, double notaFinal, double notaEspecial) {
        this.frequencia = frequencia;
        this.notaFinal = notaFinal;
        this.notaEspecial = notaEspecial;
    }
    public String determinarAprovacao() {
        if(frequencia < 75)
            return "Reprovado";
        else if (frequencia < 0 || notaFinal < 0
                || notaEspecial < 0)
            return "Reprovado";
        else if (frequencia > 75 && notaFinal < 60 &&
                notaEspecial >= 0 && notaEspecial <= 100)
            return "Reprovado";
        else if (notaFinal >= 60)
            return "Aprovado";
        else if ((notaFinal + notaEspecial) / 2 >= 60)
            return "Aprovado";
        else
            return "Reprovado";
    }
}
