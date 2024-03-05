package test.java;

import main.java.puc.minas.Aluno;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlunoTest {


    Aluno aluno;

    @Before
    public void setUp(){
        aluno = new Aluno(60,70,80);
    }

    @Test
    public void testAlunoReprovadoPelaFrequencia() {
        assertEquals("Reprovado", aluno.determinarAprovacao());
    }


}
