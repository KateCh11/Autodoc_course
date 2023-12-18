package homeWork.hw31.userCreate;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import lesson31.Specification;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Map;


/*
Дз. Написать API тест с использованием Pojo
Post запрос
Base uri https://reqres.in/
Request
/api/users
{"name": "morpheus",
    "job": "leader"
}
Response
201
{
    "name": "morpheus",
    "job": "leader",
    "id": "977",
    "createdAt": "2023-10-06T18:23:01.666Z"
}
 */

public class TestWithPojoUserCreate {
    private static final String BASE_URL = "https://reqres.in";
    private static final String ENDPOINT = "/api/users";

    private static RequestSpecification requestSpec;
    private static ResponseSpecification responseSpec;

    @BeforeClass
    public static void setup() {
        requestSpec = Specification.requestSpecification(BASE_URL);
        responseSpec = Specification.responseSpecification(201);

        // Установка спецификаций
        Specification.installSpec(requestSpec, responseSpec);
    }

    @Test
    public void testUserCreateWithPojo() {
        // Создание объекта POJO
        UserCreateNameAndJob user = new UserCreateNameAndJob("morpheus", "leader");

        /// Выполнение POST-запроса с использованием RestAssured и спецификаций
        Response response = RestAssured.given()
                .body(user)
                .post(ENDPOINT);

        // Проверка выполненных спецификаций
        response.then().spec(responseSpec);

        // Вывод тела ответа в консоль
        //System.out.println("Response Body: " + response.getBody().asString());

        // Преобразование тела ответа в Map
        Map<String, Object> responseBodyMap = response.getBody().as(Map.class);
        // Используем forEach для вывода каждой записи
        responseBodyMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
