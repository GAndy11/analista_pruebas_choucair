package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target
            .the("Select Choucair University")
            //.located(By.xpath("//div[@id='universidad']//strong"));
            .located(By.xpath("//div[@id='certificaciones']//strong"));

    public static final Target INPUT_COURSE = Target
            .the("Search the course")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target
            .the("Click on Search the course")
            .located(By.xpath("//form[@id='coursesearch']//button"));

    public static final Target SELECT_COURSE = Target
            .the("Select the course")
            //.located(By.xpath("//h4[contains(text()), 'Recursos Automatización Bancolombia]"));
            .located(By.xpath("//div[@class='search-results']//div[@class='result']//a[contains(text(),'Foundation Express')]"));

    public static final Target NAME_COURSE = Target
            .the("Course name")
            .located(By.className("aalink"));

}
