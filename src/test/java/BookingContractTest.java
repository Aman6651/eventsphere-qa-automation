import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
public class BookingContractTest {
 @Test(groups = "smoke") void bookingServiceHealthCheck() {
  given().baseUri("https://httpbin.org").when().get("/status/200").then().statusCode(200);
 }
}