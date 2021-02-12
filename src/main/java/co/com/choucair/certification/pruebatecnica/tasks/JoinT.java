package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.JoinToday;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class JoinT implements Task {
    public static JoinT inThePage() {
        return Tasks.instrumented(JoinT.class);

    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(JoinToday.JOIN_BUTTON));

    }
}
