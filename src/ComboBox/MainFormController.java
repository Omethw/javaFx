package ComboBox;

import javafx.scene.control.ComboBox;

import java.util.ArrayList;
import java.util.Arrays;

public class MainFormController {

    public ComboBox<String> cmbLanguages;

    ArrayList<String> languages = new ArrayList<>(
            Arrays.asList("Java","Python","Javascript","Php","Ruby")
    );

    public void initialize(){

        /*cmbLanguages.getItems().add("Java");
        cmbLanguages.getItems().add("Python");
        cmbLanguages.getItems().add("Javascript");
        cmbLanguages.getItems().add("Php");
        cmbLanguages.getItems().add("Ruby");*/

        for (String temp:languages) {
            cmbLanguages.getItems().add(temp);
        }
    }

}
