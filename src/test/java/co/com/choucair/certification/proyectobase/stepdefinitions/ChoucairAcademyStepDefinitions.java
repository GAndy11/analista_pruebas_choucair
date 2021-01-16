package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^than Alexander wants to learn automation at the academy Choucair$")
    public void thanAlexanderWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Alexander").wasAbleTo(OpenUp.thePage());

    }

    @When("^he search for the course Recursos Atomatizacion Bancolombia on the Choucair Academy platform$")
    public void heSearchForTheCourseRecursosAtomatizacionBancolombiaOnTheChoucairAcademyPlatform() {
    }


    @Then("^he finds the course called resources Recursos Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia() {
    }
}
