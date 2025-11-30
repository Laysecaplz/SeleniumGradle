package pages;
 
public class PaginaPrincipal extends BasePage {
 
    //private String searchButton = "//*[@id=\"page_section_48252437\"]/div/section/div[2]";
     private String sectionLink = "//a[normalize-space()='%s' and @href]";
      private String elegirUnPlanButton = "//a[normalize-space()='Elegir Plan' and @href]";
    public PaginaPrincipal() {
        super(driver);
    }
 
     // Método para navegar a www.freerangetesters.com
   public void navigateToFreeRangeTesters() {
      navigateTo("https://www.freerangetesters.com");
  //      clickElement(searchButton);
   } 

    public void clickOnSectionNavigationBar(String section) {
        // Reemplaza el marcador de posición en sectionLink con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }

     public void clickOnElegirPlanButton() {
        clickElement(elegirUnPlanButton);
    }
 
}

