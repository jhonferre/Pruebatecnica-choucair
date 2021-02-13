package co.com.choucair.certification.pruebatecnica.stepdefinitions;

import co.com.choucair.certification.pruebatecnica.model.PruebaTecnicaData;
import co.com.choucair.certification.pruebatecnica.questions.Answer;
import co.com.choucair.certification.pruebatecnica.tasks.FillForm;
import co.com.choucair.certification.pruebatecnica.tasks.JoinT;
import co.com.choucair.certification.pruebatecnica.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class PruebaTecnicaStepDefinitions {



    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^El usuario quiere registrarse en la pagina de utest$")
    public void elUsuarioQuiereRegistrarseEnLaPaginaDeUtest() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), JoinT.inThePage());
    }

    @When("^El llena el formulario de registro en la pagina de utest$")
    public void elLlenaElFormularioDeRegistroEnLaPaginaDeUtest(List<PruebaTecnicaData> dato) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(FillForm.Reg(dato.get(0).getStrFristName(),dato.get(0).getStrLastName(),
                                                                 dato.get(0).getStrEmail(),dato.get(0).getStrMonth(),dato.get(0).getStrDay(),
                                                                 dato.get(0).getStrYear(),dato.get(0).getStrCity(),dato.get(0).getStrZip(),
                                                                 dato.get(0).getStrCountry(),dato.get(0).getStrComputer(),dato.get(0).getStrVersion(),
                                                                 dato.get(0).getStrLanguage(),dato.get(0).getStrMobil(),dato.get(0).getStrModel(),
                                                                 dato.get(0).getStrOS(),dato.get(0).getStrPassword()));

    }

    @Then("^el termina el registro satisfactoriamente$")
    public void elTerminaElRegistroSatisfactoriamente(List<PruebaTecnicaData> dato) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(dato.get(0).getStrConfirm())));


    }

}
