package com.restassured.restapi.post_test;

import com.restassured.restapi.data.GlobalData;
import com.restassured.restapi.data.UsersData;
import com.restassured.restapi.utilities.FunctionUtilis;
import io.restassured.response.*;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CreateUsers {

    String createUserEndPoint = GlobalData.Service_End_Point + GlobalData.Resource_End_Point + GlobalData.createUserParameter;
    @Test
    public void create(){
        Response create = given().
                when()

                /*
                //Hardcoded Direct Body Call
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")

                */

                .body(FunctionUtilis.createRandomUser(FunctionUtilis.GivenUserName))

                //.post(GlobalData.Service_End_Point + GlobalData.Resource_End_Point + GlobalData.createUserParameter); //Call the Data
                .post(createUserEndPoint);

        create.then()
                .assertThat()
                .time(lessThan(UsersData.TIME))
                .statusCode(UsersData.CREATED_SUCCESSFULLY).log().all();

    }

}
