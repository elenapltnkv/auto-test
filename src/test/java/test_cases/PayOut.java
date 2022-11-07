package test_cases;

import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PayOut extends BaseTest{
    ResponseSpecification payOutResponseSpec;
    @Test
    @DisplayName("Выплата - позитивный кейс")
    public void positivePayout(){
        given()
                .baseUri(host)
                .log()
                .all()
                .when()
                .post("")
                .prettyPeek()
                .then()
                .extract()
            .body().jsonPath().getList("c_id", PayOut.class);
    }
}
