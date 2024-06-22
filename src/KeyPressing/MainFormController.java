package KeyPressing;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class MainFormController {

    public TextField txtKeyPress;
    public Label lblKeyPressAnswer;


    public void onKeyPress(KeyEvent keyEvent) {
        String value= txtKeyPress.getText();
        lblKeyPressAnswer.setText(value);
    }
}
