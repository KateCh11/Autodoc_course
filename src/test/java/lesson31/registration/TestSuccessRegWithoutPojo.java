package lesson31.registration;

import io.restassured.path.json.JsonPath;
import lesson31.Specification;

import org.asynchttpclient.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;

public class TestSuccessRegWithoutPojo {

    private final String BASE_URL = "https://reqres.in/";
    private final Integer EXPECTED_ID = 4;
    private final String EXPECTED_TOKEN = "QpwL5tke4Pnpja7X4";

    @Test
    public void testSuccessRegWithPojo() {
        installSpec(requestSpecification(BASE_URL),
                responseSpecification(200));
        Register register = new Register("eve.holt@reqres.in", "pistol");
        SuccessUserReg successUserReg = given()
                .body(register)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(SuccessUserReg.class);

        Assert.assertEquals(successUserReg.getId(), EXPECTED_ID);
        Assert.assertEquals(successUserReg.getToken(), EXPECTED_TOKEN);

    }
}
