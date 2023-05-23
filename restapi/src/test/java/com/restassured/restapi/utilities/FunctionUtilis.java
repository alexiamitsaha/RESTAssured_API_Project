package com.restassured.restapi.utilities;

import java.util.Random;

import static org.hamcrest.Matchers.equalTo;


public class FunctionUtilis {


    public static String randomGivennames[] = {"abcde", "fghij", "klmno", "pqrst", "uvwxyx"};
    public static String randomFamilyName[] = {"abcdek", "fghijh", "klmnog", "pqrstf", "uvwxyx", "acdefx", "ijmnop"};
    public static String GivenUserName =  randomGivennames[ new Random().nextInt(randomGivennames.length)];
    public static String FamilyUserName =  randomFamilyName[ new Random().nextInt(randomFamilyName.length)];

    public static String createRandomUser(String userName){

        /*
        //Create Body function : single name called
        String createUser = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        return createUser;
        */

        //Random Name Generate:
        String createUser ="{\n" +
                "    \"name\": \"+ userName +\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        return createUser;

    }

}
