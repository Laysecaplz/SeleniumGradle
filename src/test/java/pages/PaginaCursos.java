package pages;

public class PaginaCursos extends BasePage {

   private String Cursos = "//a[normalize-space()='Cursos' and @href]"; 

    public PaginaCursos(){
        super(driver);
    }

    public void ClickCursosLink(){
        clickElement(Cursos);
    }
    
}

