package co.com.choucair.certification.pruebatecnica.questions;

import co.com.choucair.certification.pruebatecnica.userinterface.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String strConfirm;

    public Answer(String strConfirm) {
        this.strConfirm = strConfirm;
    }

    public static Answer toThe(String strConfirm ){
        return new Answer(strConfirm);

    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String WordConfirm= Text.of(FormPage.CONFIRMATION).viewedBy(actor).asString();
        if(strConfirm.equals(WordConfirm)) {
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
