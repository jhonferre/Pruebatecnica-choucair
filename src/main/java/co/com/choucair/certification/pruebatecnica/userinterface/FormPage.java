package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {
    public static final Target INPUT_FIRSTNAME = Target.the("primer nombre")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("segundo nombre")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("correo")
            .located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("mes de nacimiento")
            .located(By.name("birthMonth"));
    public static final Target INPUT_DAY = Target.the("dia de nacimiento")
            .located(By.name("birthDay"));
    public static final Target INPUT_YEAR = Target.the("año de nacimiento")
            .located(By.name("birthYear"));
    public static final Target NEXT1_BUTTON = Target.the("Primer boton")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target INPUT_CITY = Target.the("Ingresar Ciudad")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Ingresar Codigo Postal")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("Seleccionar Pais")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target NEXT2_BUTTON = Target.the("Segundo Boton")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target INPUT_COMPUTER = Target.the("Seleccionar Computadora")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_VERSION = Target.the("Seleccionar Version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_LANGUAGE = Target.the("Seleccionar Lenguaje")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOBIL = Target.the("Seleccionar mobil")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MODEL = Target.the("Seleccionar modelo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_OP = Target.the("Seleccioanr Sistema Operativo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target NEXT3_BUTTON = Target.the("Tercer Boton")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target INPUT_PASSWORD1 = Target.the("Ingresar Contraseña")
            .located(By.id("password"));
    public static final Target INPUT_PASSWORD2 = Target.the("Confirmar contraseña")
            .located(By.id("confirmPassword"));
    public static final Target AGREE_TERMS = Target.the("Aceptar terminos")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target AGREE_PRIVACY = Target.the("Aceptar politicas")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target NEXT4_BUTTON = Target.the("Cuarto Boton")
            .located(By.xpath("//*[@id=\"laddaBtn\"]"));
    public static final Target CONFIRMATION =Target.the("Verifica mensaje de confirmacion")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[2]/div[1]/p[1]/b"));


}
