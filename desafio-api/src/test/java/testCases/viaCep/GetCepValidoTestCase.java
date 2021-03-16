package testCases.viaCep;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import testBases.viaCep.CepValidoTestBase;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class GetCepValidoTestCase extends CepValidoTestBase {

    @Test
    public void viaCepTestCase(){
    Response payload =
        given()
                .spec(requestSpec)
        .when()
                .get()
        .then()
                .log().all()
                .spec(responseSpec)
                .assertThat()
                .body(containsString("cep"), containsString("logradouro"), containsString("complemento"),
                        containsString("bairro"), containsString("localidade"), containsString("uf"),
                        containsString("ibge"))
        .extract()
        .response();
    }
}
