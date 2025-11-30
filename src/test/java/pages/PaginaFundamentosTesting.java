package pages;
 
public class PaginaFundamentosTesting extends BasePage {
 
    private String IntroduccionTestingLink = "//h3[normalize-space()='Introducción al Testing de Software']";
 
    public PaginaFundamentosTesting() {
        super(driver);
    }
 
    public void clickIntroduccionTestingLink() {
       
       clickElement(IntroduccionTestingLink);
    }
 
}
