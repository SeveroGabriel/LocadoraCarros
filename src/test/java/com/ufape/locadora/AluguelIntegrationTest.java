package com.ufape.locadora;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.ufape.locadora.DTO.AluguelDTO;
import com.ufape.locadora.controller.AluguelController;
import com.ufape.locadora.Carro;
import com.ufape.locadora.Cliente;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AluguelIntegrationTest {

    @Autowired
    private AluguelController aluguelController;

    @Test
    public void testCriarAluguel() {
        // Cria um novo aluguel para um carro e um cliente existentes
        Long idCarro = 1L;
        Long idCliente = 2L;
        LocalDate dataInicio = LocalDate.now();
        LocalDate dataFim = LocalDate.now().plusDays(7);
        BigDecimal valorTotal = BigDecimal.valueOf(700.00);
        long Carro = 0;
        AluguelDTO aluguelDTO = new AluguelDTO(Carro, Cliente, dataInicio, dataFim, valorTotal);

        // Chama o método de criação de aluguel na API
        AluguelDTO novoAluguel = aluguelController.criarAluguel(aluguelDTO);

        // Verifica se o aluguel foi criado corretamente
        assertEquals(Carro, novoAluguel.getCarro());
        assertEquals(Cliente, novoAluguel.getCliente());
        Assertions.assertEquals(dataInicio, novoAluguel.getDataInicio());
        Assertions.assertEquals(dataFim, novoAluguel.getDataFim());
        Assertions.assertEquals(valorTotal, novoAluguel.getValor());
    }

}
