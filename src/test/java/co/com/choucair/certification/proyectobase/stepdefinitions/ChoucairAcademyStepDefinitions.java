package co.com.choucair.certification.proyectobase.stepdefinitions;

import cucumber.api.java.en.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){ onStage.setTheStage(new OnlineCast()); }

    @Given("^than Alexander wants to learn automation at the academy Choucair$")
    public void thanAlexanderWantsToLearnAutomationAtTheAcademyChoucair() {

    }

    @When("^he search for the course Recursos Atomatización Bancolombia on the Choucair Academy platform$")
    public void heSearchForTheCourseRecursosAtomatizaciónBancolombiaOnTheChoucairAcademyPlatform() {

    }

    @Then("^he finds the course called resources Recursos Automatización Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia() {

    }
}
