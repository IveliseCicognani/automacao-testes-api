package testBases.viaCep;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;

public class CepValidoTestBase {

    protected static RequestSpecification requestSpec;
    protected static ResponseSpecification responseSpec;
    protected static final String requestType = "json";

    @BeforeAll
    public static void setUp(){
        buildRequestSpec();
        buildResponseSpec();
    }

    public static void buildRequestSpec(){
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://viacep.com.br")
                .setBasePath("/ws/90020180/" + requestType)
                .build();
    }

    public static void buildResponseSpec(){
        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .build();
    }
}

