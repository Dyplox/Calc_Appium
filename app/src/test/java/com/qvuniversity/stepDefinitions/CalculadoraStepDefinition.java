package com.qvuniversity.stepDefinitions;

import com.qvuniversity.questions.CalculadoraQuestions;
import com.qvuniversity.tasks.OperacionesAritmeticas;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class CalculadoraStepDefinition {

    @Before
    public void configuracion() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("abel");
    }

    @Cuando("^ingresa las dos cifras (\\d+) y (\\d+) para la (.*) _.$")
    public void ingresaLasDosCifrasYParaLaSuma(int numero1, int numero2, String operacion) {
        theActorCalled("abel").wasAbleTo(OperacionesAritmeticas.deLosDigitos(numero1, numero2, operacion));
    }

    @Entonces("^deberia encontrar el (\\d+) en la pantalla$")
    public void deberiaEncontrarElEnLaPantalla(int resultado) {
        theActorInTheSpotlight().should(seeThat(CalculadoraQuestions.valor(), equalTo(String.valueOf(resultado))));
    }
}