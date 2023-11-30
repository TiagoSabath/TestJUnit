package example;

import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTest {

//    @Order(4) para testa na ordem desejada
    @DisplayName("A")
    @Test
    void validafluxoA(){
        Assertions.assertTrue(true);
    }

//    @Order(3)
    @DisplayName("B")
    @Test
    void validafluxoB(){
        Assertions.assertTrue(true);
    }

//    @Order(2)
    @DisplayName("C")
    @Test
    void validafluxoC(){
        Assertions.assertTrue(true);
    }

//    @Order(1)
    @DisplayName("D")
    @Test
    void validafluxoD(){
        Assertions.assertTrue(true);
    }
}
