package api.stepdef.reqresin;

import api.service.reqresin.Reqresin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ReqresinStepDef {

    Reqresin reqresin = new Reqresin();

    // Action

    @And("user send PUT Update request to reqresin")
    public void putUpdate() {
        reqresin.putUpdate();
    }

    @And("user send POST login request to reqresin")
    public void postLogin() {
        reqresin.postLogin();
    }

    @And("user send GET Users request to reqresin")
    public void getUsers() {
        reqresin.getListUser();
    }

    @And("user send GET single user request to reqresin")
    public void getSingleUser() {
        reqresin.getSingleUser();
    }

    @When("user send POST login request to reqresin with body json {string}")
    public void userSendPOSTLoginRequestToReqresinWithBodyJson(String jsonPath) {
        reqresin.postLoginWithParam(jsonPath);
    }

    @When("user send POST Register request to reqresin")
    public void userSendPOSTRegisterRequestToReqresin() {
        reqresin.postRegister();

    }

    @When("user send POST register request to reqresin with body json {string}")
    public void userSendPOSTRegisterRequestToReqresinWithBodyJson(String jsonPath) {
        reqresin.postRegisterWithParam(jsonPath);
    }

    @When("user send GET single user  request to reqresin with body json {string}")
    public void userSendGETSingleUsetRequestToReqresinWithBodyJson(String jsonPath) {
        reqresin.getSingleUserNotFoundWithParam(jsonPath);
    }

    @And("user send GET List request to reqresin")
    public void getList() {
        reqresin.getList();
    }

    @And("user send GET Single request to reqresin")
    public void getSingle() {
        reqresin.getSingle();
    }

    @And("user send GET Delayed request to reqresin")
    public void getDelayed() {
        reqresin.getDelayed();
    }
}
