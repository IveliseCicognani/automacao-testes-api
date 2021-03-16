package testCases.viaCep;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ContractTest {

    @Test
    public void testeDeContratoXml(){
        Response payload =
        given()
                .baseUri("https://viacep.com.br")
                .basePath("/ws/90450210/json/")
        .when()
                .get()
        .then()
                .log().all()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("cep", equalTo("90450-210"),
                    "logradouro", equalTo("Rua Pedro Ivo"),
                    "complemento", equalTo(""),
                    "bairro", equalTo("Mont Serrat"),
                        "localidade", equalTo("Porto Alegre"),
                        "uf", equalTo("RS"),
                    "ibge", equalTo("4314902"))
                    .extract()
                    .response();

    }
}
