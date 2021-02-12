package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class JoinToday {
    public static final Target JOIN_BUTTON = Target.the("buton de registro")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
}
