//package stepdefinition.Apisteps;
//
//import Pojos.NewPatientCreation;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.github.javafaker.Faker;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//import pages.SignInPage;
//import utilities.ConfigurationReader;
//
//import static Hooks.Hooks.spec;
//import static io.restassured.RestAssured.given;
//import static utilities.ApiUtils.getRequest;
//import static utilities.Authentication.generateToken;
//
//public class US_newPatientCreation_Api_StepDefs {
//
//    SignInPage signInPage = new SignInPage();
//
//    Response response;
//
//    @Given("user provides the necessary path params")
//    public void user_provides_the_necessary_path_params() {
//        spec.pathParams("first", "api", "second", "patients", "third", 36578);
//    }
//
//    @Given("user sets the expected data {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
//    public void user_sets_the_expected_data_and_and_and_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
//            NewPatientCreation expectedData = new NewPatientCreation("jisi","jisi","1981-05-27","darcel.considine@yahoo.com",
//                    "123-456-7810","FEMALE","Apositive","tall grass cres","doon","system");
//
////            newPatientCreation.setFirstname("jisi");
////            newPatientCreation.setLastname("jisi");
////            newPatientCreation.setBirthdate("1981-05-27");
////            newPatientCreation.setEmail("darcel.considine@yahoo.com");
////            newPatientCreation.setPhone("123-456-7810");
////            newPatientCreation.setGender("FEMALE");
////            newPatientCreation.setBloodGroup("Apositive");
////            newPatientCreation.setAddress("tall grass cres");
////            newPatientCreation.setDescription("doon");
////            newPatientCreation.setUser("system");
////            newPatientCreation.setCountry("country");
//
//        }
////            List<newPatientCreation> allnewPatientCreation = getAllnewPatientCreation();
////            newPatientCreation.setId(newPatientCreation.get(newPatientCreation.size() - 3).getId());
////
////            System.out.println("User id: " + newPatientCreation.get(newPatientCreation.size() - 3).getId());
//
//
//        @Given("user sending the GET request and gets the response")
//        public void user_sending_the_get_request_and_gets_the_response () {
//            response = getRequest(generateToken(), ConfigurationReader.getProperty("patient_endpoint"));
//
//        }
//        @When("user saving the api records to correspondent files")
//        public void user_saving_the_api_records_to_correspondent_files () {
//            response.then().statusCode(200);
//            response.prettyPrint();
//
//        }
//        @Then("user validating api records")
//        public void user_validating_api_records () {
//            ObjectMapper obj = new ObjectMapper();
//
//        }
//    }
