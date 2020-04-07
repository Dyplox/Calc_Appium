package com.qvuniversity.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalcuradoraUI extends PageObject {

    public static final Target BTN_DIGITO_0 = Target.the("botón dígito").located(By.id("com.android.calculator2:id/digit_0"));
    public static final Target BTN_DIGITO_1 = Target.the("botón dígito").located(By.id("com.android.calculator2:id/digit_1"));
    public static final Target BTN_DIGITO_2 = Target.the("botón dígito").located(By.id("com.android.calculator2:id/digit_2"));
    public static final Target BTN_DIGITO_3 = Target.the("botón dígito").located(By.id("com.android.calculator2:id/digit_3"));
    public static final Target BTN_DIGITO_4 = Target.the("botón dígito").located(By.id("com.android.calculator2:id/digit_4"));
    public static final Target BTN_DIGITO_5 = Target.the("botón dígito").located(By.id("com.android.calculator2:id/digit_5"));
    public static final Target BTN_DIGITO_6 = Target.the("botón dígito").located(By.id("com.android.calculator2:id/digit_6"));
    public static final Target BTN_DIGITO_7 = Target.the("botón dígito").located(By.id("com.android.calculator2:id/digit_7"));
    public static final Target BTN_DIGITO_8 = Target.the("botón dígito").located(By.id("com.android.calculator2:id/digit_8"));
    public static final Target BTN_DIGITO_9 = Target.the("botón dígito").located(By.id("com.android.calculator2:id/digit_9"));

    public static final Target BTN_DIVIDIR = Target.the("botón divición").located(By.id("com.android.calculator2:id/op_div"));
    public static final Target BTN_MULTIPLICAR = Target.the("botón mulitplicación").located(By.id("com.android.calculator2:id/op_mul"));
    public static final Target BTN_SUMAR = Target.the("botón suma").located(By.id("com.android.calculator2:id/op_add"));
    public static final Target BTN_RESTAR = Target.the("botón resta").located(By.id("com.android.calculator2:id/op_sub"));
    public static final Target BTN_IGUAL = Target.the("botón igual").located(By.id("com.android.calculator2:id/eq"));
    public static final Target RESULTADO_OPERACION = Target.the("resultado de la operación").located(By.id("com.android.calculator2:id/result"));

    private CalcuradoraUI() {
    }
}