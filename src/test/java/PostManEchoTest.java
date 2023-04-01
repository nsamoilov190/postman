import groovy.transform.ASTTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;


public class PostManEchoTest {

@Test
    void ShouldReturnSetData() {
    // Given - When - Then
// Предусловия
    given()
            .baseUri("https://postman-echo.com")
            .body("Hello") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
            .when()
            .post("/post")
// Проверки
            .then()
            .statusCode(200)
            .body("Hello")
    ;
}
}
