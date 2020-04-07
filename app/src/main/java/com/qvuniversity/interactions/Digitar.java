package com.qvuniversity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.qvuniversity.ui.CalcuradoraUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Digitar implements Interaction {

    private int numero;

    public Digitar(int numero) {
        this.numero = numero;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String digitos = String.valueOf(numero);
        char[] arregloDigitos = digitos.toCharArray();

        for (char arregloDigito : arregloDigitos) {
            //actor.attemptsTo(Click.on(BTN_DIGITO_NUMERO.of("" + numero + "")));
            if (compare(arregloDigito, "0")) {
                actor.attemptsTo(Click.on(BTN_DIGITO_0));
            } else if (compare(arregloDigito, "1")) {
                actor.attemptsTo(Click.on(BTN_DIGITO_1));
            } else if (compare(arregloDigito, "2")) {
                actor.attemptsTo(Click.on(BTN_DIGITO_2));
            } else if (compare(arregloDigito, "3")) {
                actor.attemptsTo(Click.on(BTN_DIGITO_3));
            } else if (compare(arregloDigito, "4")) {
                actor.attemptsTo(Click.on(BTN_DIGITO_4));
            } else if (compare(arregloDigito, "5")) {
                actor.attemptsTo(Click.on(BTN_DIGITO_5));
            } else if (compare(arregloDigito, "6")) {
                actor.attemptsTo(Click.on(BTN_DIGITO_6));
            } else if (compare(arregloDigito, "7")) {
                actor.attemptsTo(Click.on(BTN_DIGITO_7));
            } else if (compare(arregloDigito, "8")) {
                actor.attemptsTo(Click.on(BTN_DIGITO_8));
            } else {
                actor.attemptsTo(Click.on(BTN_DIGITO_9));
            }
        }
    }

    private boolean compare(char arregloDigito, String digito) {
        if (String.valueOf(arregloDigito).equals(digito)) {
            return true;
        } else {
            return false;
        }
    }

    public static Digitar elNumero(int numero) {
        return instrumented(Digitar.class, numero);
    }
}