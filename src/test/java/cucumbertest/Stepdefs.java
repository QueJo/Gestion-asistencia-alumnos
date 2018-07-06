package cucumbertest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Stepdefs {

    @Given("^Profe logado en el sistema$")
    public void profe_logado_en_el_sistema() throws Throwable {
        throw new PendingException();
    }

    @Given("^ Listado Alumnos$")
    public void listado_alumnos() throws Throwable {
        throw new PendingException();
    }

    @When("^ Profe lista Alumnos$")
    public void profe_lista_alumnos() throws Throwable {
        throw new PendingException();
    }

    @When("^ Profe cambia  Alumno a \"([^\"]*)\"$")
    public void profe_cambia_alumno_a_something(String estadofinal, String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^Mostrar Alumno presente$")
    public void mostrar_alumno_presente() throws Throwable {
        throw new PendingException();
    }

    @Then("^Mostrar Alumno no presente$")
    public void mostrar_alumno_no_presente() throws Throwable {
        throw new PendingException();
    }

    @Then("^ Mostrar Alumno en \"([^\"]*)\"$")
    public void mostrar_alumno_en_something(String estadofinal, String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^Alumno logado al sistema$")
    public void alumno_logado_al_sistema() throws Throwable {
        throw new PendingException();
    }

    @And("^Alumno no logado al sistema$")
    public void alumno_no_logado_al_sistema() throws Throwable {
        throw new PendingException();
    }

    @And("^ Alumno está \"([^\"]*)\"$")
    public void alumno_est_something(String estadoinicial, String strArg1) throws Throwable {
        throw new PendingException();
    }

}