package pages;

public class GooglePage extends BasePage{
    //private String searchButton = "//input[@value='Buscar con Google']";
    private String searchButton = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]";
    //private String searchTextField = "//input[@title='Buscar']";
    private String searchTextField = "//textarea[@id='APjFqb']";
    private String textoTituloPagina = "Ecuador - Buscar con Google";
    public GooglePage() {
        super(driver);
    }

    public void navigateToGoogle() {
        navigateTo("https://www.google.com/");
        maximize();
    }

    public void clickGoogleSearch() {
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String criteria) {
        write(searchTextField, criteria);
    }

    public void obtengoTituloPagina() {
        //title1();
        System.out.println(title1());
    }

    public void compararTitulo() throws InterruptedException {
        comparation(textoTituloPagina, title1());
        Thread.sleep(3000);
        closeNavigator();
    }


}
