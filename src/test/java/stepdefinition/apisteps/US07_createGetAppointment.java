package stepdefinition.apisteps;

import Pojos.Appointment;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Hooks.Hooks.spec;

public class US07_createGetAppointment {

        Appointment app = new Appointment();
//        US07_createGetAppointment app = new US07_createGetAppointment();
        Faker faker = new Faker();



@Given("user sets the base url")
public void user_sets_the_base_url() {
        spec.pathParams("first", "api", "second", "appointments", "third", "request");
}
@When("user sets the expected appointment data")
public void user_sets_the_expected_appointment_data() {

        app.setFirstname(faker.name().firstName());
        app.setLastname(faker.name().lastName());


                }

        @When("user creates post request for appointment")
public void user_creates_post_request_for_appointment() {

        }
@When("user saves appointment data to the corresponding file")
public void user_saves_appointment_data_to_the_corresponding_file() {

        }
@Then("user validates appointment data")
public void user_validates_appointment_data() {
        
        }
}