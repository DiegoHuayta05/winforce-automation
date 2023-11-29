package win.pages;

import org.openqa.selenium.By;

public class ClientPage {
    public static By tipoDocumentoButton = By.xpath("//*[@id=\"select2-tipo_doc-container\"]");
    public static By tipoDocumentoInput = By.xpath("//*[@id=\"kt_modal_create_account\"]/span/span/span[1]/input");
    public static By dniInput = By.xpath("//*[@id=\"documento_identidad\"]");
    public static By searchScoreButton = By.xpath("//*[@id=\"search_score_cliente\"]");
    public static By okScore = By.xpath("/div/div/div[6]/button[1]");
    public static By tipoDomicilioButton = By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/div/div/div[2]/div/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/span[1]/span[1]/span/span[1]");
    public static By tipoDomicilioInput = By.xpath("//*[@id=\"kt_modal_create_account\"]/span/span/span[1]/input");
    public static By predioButton = By.xpath("//*[@id=\"nuevo_seguimiento\"]/div[2]/div/div/div/div[2]/div[7]/div[1]/span[1]/span[1]/span");
    public static By predioInput = By.xpath("//*[@id=\"kt_modal_create_account\"]/span/span/span[1]/input");
    public static By tipoContactoButton = By.xpath("//*[@id=\"select2-tipoInteres-container\"]");
    public static By tipoContactoInput = By.xpath("//*[@id=\"kt_modal_create_account\"]/span/span/span[1]/input");
    public static By nuevoClientButton = By.xpath("//*[@id=\"nuevoCliente\"]/span");
    public static By telefonoInput = By.cssSelector("#cli_tel1");
    public static By emailInput = By.xpath("//*[@id=\"cli_email\"]");
    public static By guardarClientButton = By.xpath("//*[@id=\"add_customer_data\"]");
    public static By OKButton = By.xpath("//*[@id=\"kt_body\"]/div[11]/div/div[6]/button[1]");
    public static By vendedorButton = By.xpath("//*[@id=\"nuevo_seguimiento\"]/div[2]/div/div/div/div[2]/div[11]/div/span[1]/span[1]/span");
    public static By vendedorInput = By.xpath("//*[@id=\"kt_modal_create_account\"]/span/span/span[1]/input");
    public static By guardarInformacionClienteButton = By.xpath("//*[@id=\"register_search\"]");
    public static By okButton = By.xpath("/div/div/div[6]/button[1]");
    public static By continuarButton = By.xpath("//*[@id=\"continuar\"]");
}
