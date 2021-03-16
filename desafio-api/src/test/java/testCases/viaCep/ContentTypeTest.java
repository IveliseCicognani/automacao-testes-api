package testCases.viaCep;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ContentTypeTest {

    @Test
    public void testeDeContratoXml(){
        given()
                .baseUri("https://viacep.com.br")
                .basePath("/ws/90450210/json/")
        .when()
                .get()
        .then()
                .log().all()
                .statusCode(200)
                .assertThat()
                .contentType(ContentType.JSON);
    }
}
