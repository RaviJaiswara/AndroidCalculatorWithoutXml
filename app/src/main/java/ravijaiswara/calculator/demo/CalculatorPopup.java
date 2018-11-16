package ravijaiswara.calculator.demo;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;

/**
 * Created by ravijaiswara on 16/11/18.
 */

// used to show the calculator in a pop up dialog
public class CalculatorPopup extends Dialog {

    CalculatorContentView calculator;

    public CalculatorPopup(Context context) {
        super(context);

        this.calculator = new CalculatorContentView(this);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.setContentView(calculator);
    }

    public CalculatorContentView getCalculator() {
        return calculator;
    }

}
