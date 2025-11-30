package pages;



public class PaginaComprarAhora extends BasePage {
private String ComprarAhora = "//a[@class='sc-dJkDXt fodGEh']"; 

public PaginaComprarAhora(){
    super(driver);
}
    
     public void ClickComprarLink(){
        clickElement(ComprarAhora);
    }
}
