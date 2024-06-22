package ComboBox;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Arrays;

public class MainFormController {

    public ComboBox<String> cmbLanguages;
    public TextField txtLoadData;

    ArrayList<String> languages = new ArrayList<>(
            Arrays.asList("Java","Python","Javascript","Php","Ruby")
    );

    ObservableList<String> obList = FXCollections.observableArrayList(languages);

    public void initialize(){

        cmbLanguages.setItems(obList);

        cmbLanguages.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            txtLoadData.setText(newValue);
        });
    }

}
