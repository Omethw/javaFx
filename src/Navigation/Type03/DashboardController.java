package Navigation.Type03;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DashboardController {
    public AnchorPane loadContext;

    public void windowAonAction(ActionEvent actionEvent) throws IOException {
        loadContext.getChildren().clear();
        loadContext.getChildren().add(FXMLLoader.load(getClass().getResource("WindowA.fxml")));
    }

    public void windowBOnAction(ActionEvent actionEvent) throws IOException {
        loadContext.getChildren().clear();
        loadContext.getChildren().add(FXMLLoader.load(getClass().getResource("WindowB.fxml")));
    }
}
