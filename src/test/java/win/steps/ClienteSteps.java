package win.steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import win.pages.ClientPage;
import java.time.Duration;
import static org.openqa.selenium.Keys.RETURN;

public class ClienteSteps {
    private WebDriver driver;
    public ClienteSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void inputDNI(String tipoDocument, String dni){
        this.driver.findElement(ClientPage.tipoDocumentoButton).click();
        this.driver.findElement(ClientPage.tipoDocumentoInput).sendKeys(tipoDocument,RETURN);
        this.driver.findElement(ClientPage.dniInput).sendKeys(dni);
    }
    public void scoreCrediticio(){
        this.driver.findElement(ClientPage.searchScoreButton).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(ClientPage.okScore));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(ClientPage.okScore)).click();
        //WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(ClientPage.okScore));
        //element.click();
        // Realizar clic en las coordenadas (1, 1) de la ventana del navegador
        //JavascriptExecutor executor = (JavascriptExecutor) driver;
        //executor.executeScript("document.elementFromPoint(5, 5).click();");

        //wait.until(ExpectedConditions.elementToBeClickable(ClientPage.okScore));
        //this.driver.findElement(ClientPage.okScore).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void inputCampos(String domicilio, String predio, String contacto){

        this.driver.findElement(ClientPage.tipoDomicilioButton).click();
        this.driver.findElement(ClientPage.tipoDomicilioInput).sendKeys(domicilio,RETURN);
        this.driver.findElement(ClientPage.predioButton).click();
        this.driver.findElement(ClientPage.predioInput).sendKeys(predio,RETURN);
        this.driver.findElement(ClientPage.tipoContactoButton).click();
        this.driver.findElement(ClientPage.tipoContactoInput).sendKeys(contacto,RETURN);
    }
    public void nuevoCLiente(){
        /*WebElement newClient = driver.findElement(ClientPage.nuevoClientButton);
        new Actions(driver).scrollToElement(newClient).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
        //scroll
        WebElement elemento = driver.findElement(ClientPage.nuevoClientButton);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elemento);
        elemento.click();
    }
    public void telefonoyemail(String telefono, String email) {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //WebElement elemento = wait.until(ExpectedConditions.elementToBeClickable(ClientPage.telefonoInput));
        //elemento.sendKeys(telefono);
        try {
            Thread.sleep(3000); // Pausa por 5 segundos
        } catch (InterruptedException e) {
            System.out.println("La pausa se interrumpió: " + e.getMessage());
        }
        this.driver.findElement(ClientPage.telefonoInput).sendKeys(telefono,RETURN);
        this.driver.findElement(ClientPage.emailInput).sendKeys(email,RETURN);
    }
    public void guardarCliente(){
        WebElement elemento = driver.findElement(ClientPage.guardarClientButton);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elemento);
        elemento.click();
        this.driver.findElement(ClientPage.OKButton).click();
    }
    public void tipoVendedor(String vendedor){
        this.driver.findElement(ClientPage.vendedorButton).click();
        this.driver.findElement(ClientPage.vendedorInput).sendKeys(vendedor,RETURN);
        this.driver.findElement(ClientPage.guardarInformacionClienteButton).click();
    }
    public void continuarCliente(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(ClientPage.okButton));
        //this.driver.findElement(ClientPage.okButton).click();
        this.driver.findElement(ClientPage.continuarButton).click();
    }
}
