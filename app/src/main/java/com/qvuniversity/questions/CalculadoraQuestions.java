package com.qvuniversity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.qvuniversity.ui.CalcuradoraUI.RESULTADO_OPERACION;

public class CalculadoraQuestions implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return RESULTADO_OPERACION.resolveFor(actor).getText();
    }

    public static CalculadoraQuestions valor() {
        return new CalculadoraQuestions();
    }
}