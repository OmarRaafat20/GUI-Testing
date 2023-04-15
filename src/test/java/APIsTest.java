package test.java;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;


public class APIsTest {

    private final RequestSpecification request = RestAssured.given().contentType(ContentType.JSON);

    @Test
    public void testLoginEndpoint() {
        String jsonBody = "{\n" +
                "  \"username\": \"merchant@foodics.com\",\n" +
                "  \"password\": \"123456\"\n" +
                "}";
        given()
                .spec(request)
                .body(jsonBody)
                .when()
                .post("https://pay2.foodics.dev/cp_internal/login")
                .then()
                .statusCode(200)
                .body("token", notNullValue());
    }

    @Test
    public void testWhoAmIEndpoint() {
        String token = loginAndGetToken();
        given()
                .spec(request)
                .header("Authorization", "Bearer " + token)
                .when()
                .get("https://pay2.foodics.dev/cp_internal/whoami")
                .then()
                .statusCode(200)
                .body("email", equalTo("merchant@foodics.com"));
    }

    @Test
    public void testUnauthorizedAccessToWhoAmIEndpoint() {
        given()
                .spec(request)
                .when()
                .get("https://pay2.foodics.dev/cp_internal/whoami")
                .then()
                .statusCode(401);
    }

    @Test
    private String loginAndGetToken() {
        String jsonBody = "{\n" +
                "  \"username\": \"merchant@foodics.com\",\n" +
                "  \"password\": \"123456\"\n" +
                "}";
        return given()
                .spec(request)
                .body(jsonBody)
                .when()
                .post("https://pay2.foodics.dev/cp_internal/login")
                .then()
                .extract()
                .path("token");
    }
}
