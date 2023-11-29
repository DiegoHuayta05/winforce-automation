package win.steps;

import org.openqa.selenium.WebDriver;
import win.pages.VentaPage;

public class VentaSteps {
    private WebDriver driver;

    public VentaSteps(WebDriver driver){
        this.driver = driver;
    }

    public void nuevoLead(){
        this.driver.findElement(VentaPage.ventaButton).click();
        this.driver.findElement(VentaPage.nuevoLeadButton).click();
    }

    public void añadirLead(){
        this.driver.findElement(VentaPage.añadirLeadButton).click();
    }
    public void typeLatitud(String latitud){
        this.driver.findElement(VentaPage.latitudInput).sendKeys(latitud);
    }
    public void typeLongitud(String longitud){
        this.driver.findElement(VentaPage.longitudInput).sendKeys(longitud);
    }
    public void ContinueClic(){
        this.driver.findElement(VentaPage.searchButton).click();
        this.driver.findElement(VentaPage.continueButton).click();
        this.driver.findElement(VentaPage.continue2Button).click();
    }
}
