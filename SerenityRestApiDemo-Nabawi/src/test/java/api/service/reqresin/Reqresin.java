package api.service.reqresin;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;


import java.io.File;

public class Reqresin {

    public Response response;

    private static final String REQRESIN_BASEURL = "https://reqres.in";

    private String composeBodyJson() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email", "eve.holt@reqres.in");
        bodyJson.put("password", "cityslicka");

        return bodyJson.toString();
    }

    public void getListUser() {
        SerenityRest.given()
                .queryParam("page", "1")
                .get(REQRESIN_BASEURL + "/api/users");
    }

    public void getSingleUser() {
        SerenityRest.given()
                .queryParam("page", "1")
                .get(REQRESIN_BASEURL + "/api/users/2");
    }

    public void postLogin() {
        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(composeBodyJson())
                .post(REQRESIN_BASEURL + "/api/login");
    }

    public void postLoginWithParam(String jsonPath) {
        File bodyJson = new File(String.format("src/test/resources/payload/%s", jsonPath));

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson)
                .post(REQRESIN_BASEURL + "/api/login");
    }

    public void postRegister() {
        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(composeBodyJson())
                .post(REQRESIN_BASEURL + "/api/register");
    }

    public void postRegisterWithParam(String jsonPath) {
        File bodyJson = new File(String.format("src/test/resources/payload/%s", jsonPath));

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson)
                .post(REQRESIN_BASEURL + "/api/register");
    }

    public void getSingleUserNotFoundWithParam(String jsonPath) {
        File bodyJson = new File(String.format("src/test/resources/payload/%s", jsonPath));

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson)
                .post(REQRESIN_BASEURL + "/api/user/23");
    }

    public void putUpdate() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("name", "morpheus");
        bodyJson.put("job", "zion");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .put(REQRESIN_BASEURL + "/api/users/2");
    }

    public void getList() {
        SerenityRest.given()
                .queryParam("page", "1")
                .get(REQRESIN_BASEURL + "/api/unknown");
    }

    public void getSingle() {
        SerenityRest.given()
                .queryParam("page", "1")
                .get(REQRESIN_BASEURL + "/api/unknown/2");
    }

    public void getDelayed() {
        SerenityRest.given()
                .queryParam("page", "1")
                .get(REQRESIN_BASEURL + "/api/unknown/23");
    }
}
