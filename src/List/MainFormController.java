package List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MainFormController {
    public ListView<String> lstLanguages;
    public TextField txtOutput;
    public TextField textInput;

    public void inputOnAction(ActionEvent actionEvent) {

        ObservableList<String> oblist = FXCollections.observableArrayList();
        oblist.add(textInput.getText());
        lstLanguages.setItems(oblist);
        textInput.clear();
    }
}
