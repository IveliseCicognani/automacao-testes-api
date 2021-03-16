package testCases.viaCep;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import testBases.viaCep.CepInvalidoTestBase;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class GetCepInvalidoTestCase extends CepInvalidoTestBase {

    @Test
    public void CepInvalidoTestCase(){
    Response payload =
        given()
                .spec(requestSpec)
                .log().all()
        .when()
                .get()
        .then()
                .log().all()
                .spec(responseSpec)
                .assertThat()
                .contentType(ContentType.HTML)
                .body(containsString("Erro 400"),
                        containsString("Verifique a sua URL (Bad Request)"))
                .extract()
                .response();
    }
}
