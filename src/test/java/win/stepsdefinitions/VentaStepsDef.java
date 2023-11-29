package win.stepsdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import win.steps.ClienteSteps;
import win.steps.LoginSteps;
import win.steps.OfertaSteps;
import win.steps.VentaSteps;

public class VentaStepsDef {
    private WebDriver driver;
    private Scenario scenario;

    @Before(order = 0)
    public void setup(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Before(order = 1)
    public void setScenario (Scenario scenario){
        this.scenario = scenario;
    }
    @After
    public void quitDriver(){
        // driver.quit();
    }

    @Given("que me encuentro en la página de Winforce")
    public void que_me_encuentro_en_la_página_de_winforce() {
        driver.get("http://10.1.2.9/proy_cross/Winet.Winforce/login");
        screenShot();
    }
    @When("coloco las credenciales usuario: {string} y contraseña: {string}")
    public void pongo_coloco_las_credenciales_usuario_y_contraseña(String user, String password) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.typeUser(user);
        loginSteps.typePassword(password);
        loginSteps.login();
        screenShot();
    }
    @And("me dirigo al botón de ventas y Nuevo LEAD")
    public void me_dirigo_al_botón_de_ventas_y_Nuevo_LEAD() {
        VentaSteps ventaSteps = new VentaSteps(driver);
        ventaSteps.nuevoLead();
        screenShot();

    }
    @And("le doy clic al botón Añadir Nuevo Lead")
    public void le_doy_clic_al_botón() {
        VentaSteps ventaSteps = new VentaSteps(driver);
        ventaSteps.añadirLead();
        screenShot();
    }
    @And("coloco como Latitud: {string} y como Longitud: {string} luego al botón Confirmar")
    public void coloco_como_latitud_y_como_longitud(String latitud, String longitud) {
        VentaSteps ventaSteps = new VentaSteps(driver);
        ventaSteps.typeLatitud(latitud);
        ventaSteps.typeLongitud(longitud);
        screenShot();
    }

    @And("valido que me aparece la ventana para realizar una venta")
    public void valido_que_me_aparece_la_ventana_para_realizar_una_venta() {
        VentaSteps ventaSteps = new VentaSteps(driver);
        ventaSteps.ContinueClic();
        screenShot();
    }
    @And("coloco el tipo de documento: {string} y el DNI: {string}")
    public void coloco_el_dni(String tipoDoc, String dni) {
        ClienteSteps clienteSteps = new ClienteSteps(driver);
        clienteSteps.inputDNI(tipoDoc,dni);
        screenShot();
    }
    @And("le doy a buscar score crediticio al cliente")
    public void le_doy_a_buscar_score_crediticio_al_cliente() {
        ClienteSteps clienteSteps = new ClienteSteps(driver);
        clienteSteps.scoreCrediticio();
        screenShot();
    }
    @And("como tipo de domicilio: {string}, como predio: {string}, como tipo de contacto: {string}")
    public void como_tipo_de_domicilio_hogar_como_predio_propietario_como_tipo_de_contacto_venta(String domicilio, String predio, String contacto) {
        ClienteSteps clienteSteps = new ClienteSteps(driver);
        clienteSteps.inputCampos(domicilio,predio,contacto);
        screenShot();
    }
    @And("le doy clic al botón Nuevo Cliente")
    public void le_doy_clic_al_botón_nuevo_cliente() {
        ClienteSteps clienteSteps = new ClienteSteps(driver);
        clienteSteps.nuevoCLiente();
        screenShot();
    }
    @And("coloco el número: {string} y el email: {string}")
    public void coloco_el_número_y_el_email(String telefono, String email) {
        ClienteSteps clienteSteps = new ClienteSteps(driver);
        clienteSteps.telefonoyemail(telefono,email);
        screenShot();
    }
    @And("le doy guardar Cliente")
    public void le_doy_guardar_cliente() {
        ClienteSteps clienteSteps = new ClienteSteps(driver);
        clienteSteps.guardarCliente();
        screenShot();
    }
    @And("selecciono como vendedor a: {string} y le doy guardar datos del cliente")
    public void selecciono_el_tipo_de_vendedor_y_le_doy_guardar_datos_del_cliente(String vendedor) {
        ClienteSteps clienteSteps = new ClienteSteps(driver);
        clienteSteps.tipoVendedor(vendedor);
        screenShot();
    }
    @And("valido que se guarda datos del cliente")
    public void valido_que_se_guarda_datos_del_cliente() {
        ClienteSteps clienteSteps = new ClienteSteps(driver);
        clienteSteps.continuarCliente();
        screenShot();
    }
    @And("selecciono como tipo de búsqueda: {string} y selecciono {string}")
    public void selecciono_como_tipo_de_búsqueda_y_selecciono(String tipo, String opcion) {
        OfertaSteps ofertaSteps = new OfertaSteps(driver);
        ofertaSteps.typeOferta(tipo,opcion);
        screenShot();
    }

    @And("selecciono la oferta número 1 y le doy continuar")
    public void selecciono_la_oferta_número_y_le_doy_continuar() {
        OfertaSteps ofertaSteps = new OfertaSteps(driver);
        ofertaSteps.continuarOferta();
        screenShot();
    }

    @And("valido que me encuentro en la confirmación de la venta")
    public void valido_que_me_encuentro_en_la_confirmación_de_la_venta() {
        screenShot();
    }

    @And("le doy como Origen de Venta: {string}")
    public void le_doy_como_origen_de_venta(String origen) {
        OfertaSteps ofertaSteps = new OfertaSteps(driver);
        ofertaSteps.typeOrigen(origen);
        screenShot();
    }

    @And("y selecciono la fecha de programación: {int}\\/{int}\\/{int}")
    public void y_selecciono_la_fecha_de_programación(Integer int1, Integer int2, Integer int3) {
        OfertaSteps ofertaSteps = new OfertaSteps(driver);
        ofertaSteps.fechaProgramacion();
        screenShot();
    }

    @And("y selecciono como tramo horario: {string}")
    public void y_selecciono_como_tramo_horario(String tramo) {
        OfertaSteps ofertaSteps = new OfertaSteps(driver);
        ofertaSteps.tramoHorario(tramo);
        screenShot();
    }

    @And("que se enteró por: {string} y le doy al botón de solicitar ahora")
    public void que_se_enteró_por_y_le_doy_al_botón_de_solicitar_ahora(String fb) {
        OfertaSteps ofertaSteps = new OfertaSteps(driver);
        ofertaSteps.Origen(fb);
        screenShot();
    }

    @Then("valido que se realizo la venta")
    public void valido_que_se_realizo_la_venta() {
        OfertaSteps ofertaSteps = new OfertaSteps(driver);
        ofertaSteps.solicitudAhora();
        screenShot();
    }
    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia,"image/png","evidencias");
    }

}
