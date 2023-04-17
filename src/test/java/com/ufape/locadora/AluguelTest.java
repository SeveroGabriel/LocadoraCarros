package com.ufape.locadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AluguelTest {

    @Test
    void testCalculaValorTotal() {
        // Cria um aluguel com valor da diária R$ 50,00 e 5 dias de duração
        Aluguel aluguel = new Aluguel(50.0, 5);

        // Calcula o valor total do aluguel
        double valorTotal = aluguel.getValorTotal();

        // Verifica se o valor total é igual a R$ 250,00
        assertEquals(250.0, valorTotal, 0.001);
    }
}
