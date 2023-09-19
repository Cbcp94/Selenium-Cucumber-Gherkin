package steps;

import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps {
    GooglePage google = new GooglePage();

    @Given("^navego a la pagina de Google$")
    public void navigatGoogle(){
        google.navigateToGoogle();
    }

    @When("^Ingreso mi criterio de busqueda$")
    public void enterSearchCriteria(){
        google.enterSearchCriteria("Google");
    }

    @And("^Click en el boton buscar$")
    public void clickSearchButton(){
        google.clickGoogleSearch();
    }

    @Then("^Obtengo resultado$")
    public void validateResults(){

    }
}
