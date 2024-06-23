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

    ObservableList<String> oblist = FXCollections.observableArrayList();

    public void inputOnAction(ActionEvent actionEvent) {

        oblist.add(textInput.getText());
        lstLanguages.setItems(oblist);
        textInput.clear();
    }
}
