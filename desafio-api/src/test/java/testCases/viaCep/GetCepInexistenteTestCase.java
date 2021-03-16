package testCases.viaCep;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import testBases.viaCep.CepInexistenteTestBase;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class GetCepInexistenteTestCase extends CepInexistenteTestBase {

    @Test
    public void CepInexistenteTestCase(){
    Response payload =
        given()
                .spec(requestSpec)
        .when()
                .get()
        .then()
                .log().all()
                .spec(responseSpec)
                .assertThat()
                .body(containsString("erro"))
                .extract()
                .response();

        Boolean erro = payload.then().extract().path("erro");
        System.out.println("erro = " + erro);
    }
}
