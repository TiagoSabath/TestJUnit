package example;

import org.example.BancoDeDados;
import org.example.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosTest {

    @BeforeAll
    static void configuraConexao( ){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDados(){
        BancoDeDados.insereDados(new Pessoa("João", LocalDate.of(1998,10,13)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao( ){
        BancoDeDados.finalizarConexao();
    }
}
