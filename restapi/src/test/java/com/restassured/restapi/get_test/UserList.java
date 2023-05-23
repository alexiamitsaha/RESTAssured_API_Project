package com.restassured.restapi.get_test;

import io.restassured.response.*;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserList {
    @Test
    public void userList(){
        Response userList = given().
                when().
                get("https://reqres.in/api/users?page=2");

        userList.then()
                .assertThat()
                .time(lessThan(5000L))
                .statusCode(200)
                .body("page", equalTo(2),
                        "per_page", equalTo(6),
                        "total", equalTo (12),
                        "total_pages", equalTo (2));

    }
}
