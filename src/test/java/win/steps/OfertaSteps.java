package win.steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import win.pages.OfertaPage;

import static org.openqa.selenium.Keys.RETURN;

public class OfertaSteps {
    private WebDriver driver;
    public OfertaSteps(WebDriver driver){
        this.driver = driver;
    }
    public void typeOferta(String tipo, String opcion){
        this.driver.findElement(OfertaPage.tipoBusquedaButton).click();
        this.driver.findElement(OfertaPage.tipoBusquedaButton).sendKeys(tipo,RETURN);
        this.driver.findElement(OfertaPage.ofertaButton).click();
        this.driver.findElement(OfertaPage.ofertaButton).sendKeys(opcion,RETURN);
    }
    public void continuarOferta(){
        this.driver.findElement(OfertaPage.win100mbOption).click();
        //this.driver.findElement(OfertaPage.continuarButton).click();
        WebElement elemento = driver.findElement(OfertaPage.continuarButton);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elemento);
        elemento.click();
    }
    public void typeOrigen(String origen){
        this.driver.findElement(OfertaPage.origenButton).click();
        this.driver.findElement(OfertaPage.origenInput).sendKeys(origen,RETURN);
    }

    public void fechaProgramacion(){
        this.driver.findElement(OfertaPage.fechaButton).click();
        this.driver.findElement(OfertaPage.flechaButton).click();
        this.driver.findElement(OfertaPage.firstOption).click();
    }
    public void tramoHorario(String tramo){
        this.driver.findElement(OfertaPage.tramoHorario).click();
        this.driver.findElement(OfertaPage.tramoHorario).sendKeys(tramo,RETURN);
    }
    public void Origen(String fb){
        this.driver.findElement(OfertaPage.fuenteButton).click();
        this.driver.findElement(OfertaPage.fuentInput).sendKeys(fb,RETURN);
    }
    public void solicitudAhora(){
        //driver.find_element_by_css_selector('div.aaA').send_keys(r"C:\Users\micomputer\Desktop\perritos\dog.png")
        this.driver.findElement(OfertaPage.archivoButton).sendKeys("C:\\Users\\analistaqa8\\Downloads\\PruebasQA.pdf");
        WebElement elemento = driver.findElement(OfertaPage.solicitudButton);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elemento);
        elemento.click();
    }
}
