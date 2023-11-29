package win.pages;

import org.openqa.selenium.By;

public class VentaPage {
    public static By ventaButton = By.xpath("//*[@id=\"#kt_header_menu\"]/div[2]/span/span[1]");
    public static By nuevoLeadButton = By.xpath("//*[@id=\"#kt_header_menu\"]/div[2]/div/div/a[1]/span[2]");
    public static By añadirLeadButton = By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div/div[1]/button");
    public static By latitudInput = By.xpath("//*[@id=\"gf_lat\"]");
    public static By longitudInput = By.xpath("//*[@id=\"gf_lon\"]");
    public static By searchButton = By.xpath("//*[@id=\"gf_buscar_coordenadas\"]/img");
    public static By continueButton = By.xpath("//*[@id=\"map\"]/div[1]/div[6]/div/div[1]/div/input");
    public static By continue2Button = By.xpath("//*[@id=\"continuar\"]");

}
