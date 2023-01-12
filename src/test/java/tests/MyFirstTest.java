package tests;

import static io.restassured.RestAssured.given;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.Test;

public class MyFirstTest extends BaseTest {

  @Test
  public void myFirstTest() {
    given()
        .filter(new RequestLoggingFilter())
        .filter(new ResponseLoggingFilter())
        .baseUri("https://petstore.swagger.io/v2/pet/1")
        .get()
        .then()
        .statusCode(200);
  }

}
