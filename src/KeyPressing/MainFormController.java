package KeyPressing;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class MainFormController {

    public TextField txtKeyPress;
    public Label lblKeyPressAnswer;
    public TextField txtKeyRelease;
    public Label lblKeyRelease;


    public void onKeyPress(KeyEvent keyEvent) {
        String value= txtKeyPress.getText();
        lblKeyPressAnswer.setText(value);
    }

    public void onKeyRelease(KeyEvent keyEvent) {
        String value= txtKeyRelease.getText();
        lblKeyRelease.setText(value);
    }
}
