package example;

import org.example.Conta;
import org.example.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

 @Test
    void validarCnarioDeExcecao(){
     Conta contaOrigem = new Conta("123", 0);
     Conta contaDestino = new Conta("323", 100);

     TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

     //Teste que uma exceção seja lançada
//     Assertions.assertThrows(IllegalArgumentException.class, () ->
//             transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));

     //teste para quando uma exceção nao for lançada
     Assertions.assertDoesNotThrow( () ->
             transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));

 }
}
