package test_cases;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class BaseTest {
    static Properties properties;
    static String host;
    //static String XDataHash;

    @BeforeAll
    static void beforeAll() throws IOException {
        properties = new Properties();
        properties.load(Files.newInputStream(Path.of("src/test/java/additional/application.properties")));
        host=properties.getProperty("host");
        //XDataHash= properties.getProperty("X-Data-Hash");
        RestAssured.baseURI = host;
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        //RestAssured.responseSpecification = positiveResponseSpecification;

    }

}
