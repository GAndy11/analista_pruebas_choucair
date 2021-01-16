package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target
            .the("Select Choucair University")
            .located(By.xpath("//div[@id='universidad']//strong"));

    public static final Target INPUT_COURSE = Target
            .the("Search the course")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target
            .the("Clic on Search the course")
            .located(By.xpath("//div[@class='btn btn-secundary']//strong"));

    public static final Target SELECT_COURSE = Target
            .the("Select the course")
            .located(By.xpath("//h4[contains(text()), 'Recursos Automatización Bancolombia]"));

}
