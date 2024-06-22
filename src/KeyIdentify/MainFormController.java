package KeyIdentify;

import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainFormController {

    public TextField txtInput;
    public TextField txtOutput;

    public void initialize(){

        //Add a Listener
        txtInput.textProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("New Value : "+newValue);
            System.out.println("Old Value : "+oldValue);
        });

    }
}
