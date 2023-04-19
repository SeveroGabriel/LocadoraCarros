package com.ufape.locadora;

import com.ufape.locadora.DTO.AluguelDTO;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class AluguelAPITest {

    @Test
    public void testGetById() {
        RestAssured.baseURI = "http://localhost:8080";
        AluguelDTO expected = new AluguelDTO();
        expected.setId(1L);
        expected.setCliente(1L);
        expected.setId(1L);
        expected.setDataInicio("2023-04-17");
        expected.setDataFim("2023-04-20");
        expected.setValorTotal(1000.0);

        given()
                .contentType(ContentType.JSON)
                .when()
                .get("/alugueis/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(expected.getId().intValue()))
                .body("clienteId", equalTo(expected.getClienteId().intValue()))
                .body("carroId", equalTo(expected.getCarroId().intValue()))
                .body("dataAluguel", equalTo(expected.getDataAluguel()))
                .body("dataDevolucao", equalTo(expected.getDataDevolucao()))
                .body("valorTotal", equalTo(expected.getValorTotal().floatValue()));
    }

    @Test
    public void testCreate() {
        RestAssured.baseURI = "http://localhost:8080";
        AluguelDTO aluguel = new AluguelDTO();
        aluguel.setCliente(1L);
        aluguel.setId(1L);
        aluguel.setDataInicio("2023-04-17");
        aluguel.setDataFim("2023-04-20");
        aluguel.setValorTotal(1000.0);

        given()
                .contentType(ContentType.JSON)
                .body(aluguel)
                .when()
                .post("/alugueis")
                .then()
                .statusCode(201);
    }

    @Test
    public void testUpdate() {
        RestAssured.baseURI = "http://localhost:8080";
        AluguelDTO aluguel = new AluguelDTO();
        aluguel.setId(1L);
        aluguel.setCliente(2L);
        aluguel.setId(2L);
        aluguel.setDataInicio("2023-04-18");
        aluguel.setDataFim("2023-04-21");
        aluguel.setValorTotal(1500.0);

        given()
                .contentType(ContentType.JSON)
                .body(aluguel)
                .when()
                .put("/alugueis/1")
                .then()
                .statusCode(200);
    }

    @Test
    public void testDelete() {
        RestAssured.baseURI = "http://localhost:8080";
        given()
                .when()
                .delete("/alugueis/1")
                .then()
                .statusCode(204);
    }
}
