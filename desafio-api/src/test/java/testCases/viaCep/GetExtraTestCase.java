package testCases.viaCep;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import testBases.viaCep.CepExtraTestBase;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetExtraTestCase extends CepExtraTestBase {

    @Test
    public void extraTestCase(){
        given()
                .spec(requestSpec)
        .when()
                .get()
        .then()
                .log().all()
                .spec(responseSpec)
        .assertThat()
        .contentType(ContentType.JSON)
        .body("size()", greaterThan(1),
                "cep[0]", equalTo("94085-170"),
                "cep[1]", equalTo("94175-000"));
    }
}
