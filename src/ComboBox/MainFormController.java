package ComboBox;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

import java.util.ArrayList;
import java.util.Arrays;

public class MainFormController {

    public ComboBox<String> cmbLanguages;

    ArrayList<String> languages = new ArrayList<>(
            Arrays.asList("Java","Python","Javascript","Php","Ruby")
    );

    ObservableList<String> obList = FXCollections.observableArrayList(languages);

    public void initialize(){

        cmbLanguages.setItems(obList);
    }

}
