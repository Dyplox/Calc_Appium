package com.qvuniversity.tasks;

import com.qvuniversity.interactions.Digitar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static com.qvuniversity.ui.CalcuradoraUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OperacionesAritmeticas implements Task {

    private int num1;
    private int num2;
    private String operacion;

    public OperacionesAritmeticas(int num1, int num2, String operacion) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Target operacionT;
        switch (operacion) {

            case "suma":
                operacionT = BTN_SUMAR;
                realizarOperacion(operacionT, num1, num2, actor);
                break;
            case "resta":
                operacionT = BTN_RESTAR;
                realizarOperacion(operacionT, num1, num2, actor);
                break;
            case "multiplicacion":
                operacionT = BTN_MULTIPLICAR;
                realizarOperacion(operacionT, num1, num2, actor);
                break;
            case "division":
                operacionT = BTN_DIVIDIR;
                realizarOperacion(operacionT, num1, num2, actor);
                break;
        }
    }

    private <T extends Actor> void realizarOperacion(Target operacionT, int num1, int num2, T actor) {
        System.out.print(operacionT.toString());
        actor.attemptsTo(
                Digitar.elNumero(num1),
                Click.on(operacionT),
                Digitar.elNumero(num2),
                Click.on(BTN_IGUAL)
        );
    }

    public static OperacionesAritmeticas deLosDigitos(int num1, int num2, String operacion) {
        return instrumented(OperacionesAritmeticas.class, num1, num2, operacion);
    }
}