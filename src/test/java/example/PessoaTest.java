package example;

import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void validarCalculodeIdade(){
        Pessoa p1 = new Pessoa("Tiago", LocalDate.of(2015,1 ,1));
        Assertions.assertEquals(8, p1.getIdade());
    }

    @Test
    void CalcularSeEhMaiordeIdade(){
        Pessoa p2 = new Pessoa("Joao", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(23, p2.getIdade());
    }

    @Test
    void deveRetornaSeEhMaiorDeIdade(){
        Pessoa p2 = new Pessoa("Joao", LocalDate.of(2000, 1, 1));
        Assertions.assertTrue(p2.ehMaiordeIdade());

        Pessoa p3 = new Pessoa("Joao", LocalDate.now());
        Assertions.assertFalse(p3.ehMaiordeIdade());
    }
}
