package ComboBox;

import javafx.scene.control.ComboBox;

public class MainFormController {

    public ComboBox<String> cmbLanguages;

    public void initialize(){

        cmbLanguages.getItems().add("Java");
        cmbLanguages.getItems().add("Python");
        cmbLanguages.getItems().add("Javascript");
        cmbLanguages.getItems().add("Php");
        cmbLanguages.getItems().add("Ruby");
    }

}
