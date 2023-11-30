package example;

import org.example.Pessoa;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import  org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AssertionsTeste {
    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }


    @Test
    void ValidarSeObjetoEstaNulo(){
        Pessoa p1 = null;
        Assertions.assertNull(p1);

        p1 = new Pessoa("Felipe", LocalDate.now());
        Assertions.assertNotNull(p1);
    }

    @Test
    void ValidarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double outrovalor = 5.0;

        Assertions.assertEquals(valor, outrovalor);
    }
}
