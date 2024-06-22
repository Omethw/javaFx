package KeyPressing;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainFormController {

    public TextField txtKeyPress;
    public Label lblKeyPressAnswer;

    public void keyPressOnAction(ActionEvent actionEvent) {

        String value= txtKeyPress.getText();
        lblKeyPressAnswer.setText(value);
    }
}
