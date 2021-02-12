package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

public class FillForm implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strCity;
    private String strZip;
    private String strCountry;
    private String strComputer;
    private String strVersion;
    private String strLanguage;
    private String strMobil;
    private String strModel;
    private String strOS;
    private String strPassword;

    public FillForm(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strCity, String strZip, String strCountry, String strComputer, String strVersion, String strLanguage, String strMobil, String strModel, String strOS, String strPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strMobil = strMobil;
        this.strModel = strModel;
        this.strOS = strOS;
        this.strPassword = strPassword;
    }

    public static FillForm Reg(String strFristName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strCity, String strZip, String strCountry, String strComputer, String strVersion, String strLanguage, String strMobil, String strModel, String strOS, String strPassword) {
        return Tasks.instrumented(FillForm.class,strFristName,strLastName,strEmail,strMonth,strDay,strYear,strCity,strZip,strCountry,strComputer,strVersion,strLanguage,strMobil,strModel,strOS,strPassword );
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(strFirstName).into(FormPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(FormPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(FormPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(FormPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(FormPage.INPUT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(FormPage.INPUT_YEAR),
                Click.on(FormPage.NEXT1_BUTTON),
                Enter.theValue(strCity).into(FormPage.INPUT_CITY),
                Enter.theValue(strZip).into(FormPage.INPUT_ZIP),
                EnterValue.(strCountry).into(FormPage.INPUT_COUNTRY),
                Click.on(FormPage.NEXT2_BUTTON));
    }
}
