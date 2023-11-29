package win.pages;

import org.openqa.selenium.By;

public class OfertaPage {
    public static By tipoBusquedaButton = By.xpath("//*[@id=\"tipoBusqueda\"]");
    public static By ofertaButton = By.xpath("//*[@id=\"filtroOferta\"]");
    public static By win100mbOption = By.xpath("//*[@id=\"nav_planes\"]/div[1]/div/div[1]/div[1]/input");
    public static By continuarButton = By.cssSelector("#continuar");

    public static By origenButton = By.xpath("//*[@id=\"select2-venta_origen-container\"]");
    public static By origenInput = By.xpath("//*[@id=\"kt_modal_create_account\"]/span/span/span[1]/input");
    public static By fechaButton = By.xpath("//*[@id=\"tramo_fecha\"]");
    public static By flechaButton = By.xpath("//*[@id=\"kt_body\"]/div[4]/div[1]/span[2]");
    public static By firstOption = By.xpath("//*[@id=\"kt_body\"]/div[4]/div[2]/div/div[2]/div/span[5]");
    public static By tramoHorario= By.xpath("//*[@id=\"tramo_horario_rango\"]");
    public static By fuenteButton= By.xpath("//*[@id=\"select2-como_se_entero-container\"]");
    public static By fuentInput= By.xpath("//*[@id=\"kt_modal_create_account\"]/span/span/span[1]/input");
    public static By solicitudButton= By.xpath("//*[@id=\"btn_solicitar_ahora\"]");

    public static By archivoButton = By.xpath("//*[@id=\"fileInput\"]");
}
