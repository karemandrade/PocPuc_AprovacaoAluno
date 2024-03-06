package test.java;

import main.java.puc.minas.Aluno;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlunoTest {
    @Test
    public void testAlunoReprovadoPelaFrequencia() {
        Aluno aluno1 = new Aluno(60, 70, 80);
        assertEquals("Reprovado", aluno1.determinarAprovacao());
    }
    @Test
    public void testAlunoAprovadoPelaNotaFinal() {
        Aluno aluno2 = new Aluno(80, 65, 80);
        assertEquals("Aprovado", aluno2.determinarAprovacao());
    }

    @Test
    public void testAlunoReprovadoPelosDemaisCasos() {
        Aluno aluno3 = new Aluno(80, 41, 70);
        assertEquals("Reprovado", aluno3.determinarAprovacao());
    }

    @Test
    public void testAlunoReprovadoPelaFrequenciaNegativa() {
        Aluno aluno4 = new Aluno(-1, 70, 80);
        assertEquals("Reprovado", aluno4.determinarAprovacao());
    }

    @Test
    public void testAlunoReprovadoPelaNotaFinalNegativa() {
        Aluno aluno5 = new Aluno(80, -30, 70);
        assertEquals("Reprovado", aluno5.determinarAprovacao());
    }

    @Test
    public void testAlunoReprovadoPelaNotaEspecialNegativa() {
        Aluno aluno6 = new Aluno(80, 70, -40);
        assertEquals("Reprovado", aluno6.determinarAprovacao());
    }
}
