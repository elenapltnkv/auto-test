package test_cases;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;



public class BalancesGet extends BaseTest{


    @Test
    void getPingPositiveTest(){
        given()
                .baseUri(host)
                .header("Content-Type","application/json")
                .headers("X-Data-Application-Id", "1", "X-Data-Hash", "fd72b07e5574a98f98d64adef7826693f9cc821bd85eab7ac0f0f3e34512221e6c0ebe3c1281edd2c2052be181d7073fa9659259ed96d3dccc216abe54cb40a6")
                .log()
                .all()
                .body("{\n" +
                        "    \"service_id\": 500,\n" +
                        "    \"method\": \"balances.get\",\n" +
                        "    \"params\": {}\n" +
                        "}")
                .when()
                .post("")
                .prettyPeek()
                .then()
                .statusCode(200);
    }
    @Test
    void getPingNegativeTest(){
        given()
                .baseUri(host)
                .header("Content-Type","application/json")
                .header("X-Data-Application-Id", "1")
                .header("X-Data-Hash", "fd72b07e5574a98f98d64adef7826693f9cc821bd85eab7ac0f0f3e34512221e6c0ebe3c1281edd2c2052be181d7073fa9659259ed96d3dccc216abe54cb40a6")
                .log()
                .all()
                .body("{\n" +
                        "    \"service_id\": 501,\n" +
                        "    \"method\": \"balances.get\",\n" +
                        "    \"params\": {}\n" +
                        "}")
                .when()
                .post("")
                .prettyPeek()
                .then()
                .statusCode(400);
    }
}
