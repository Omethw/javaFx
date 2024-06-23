package Navigation.Type02;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class MainController {
    public AnchorPane contextA;
    public AnchorPane contextB;

    public void nextOnAction(ActionEvent actionEvent) throws IOException {

        Parent load = FXMLLoader.load(getClass().getResource("WindowB.fxml"));
        Stage stage = (Stage) contextA.getScene().getWindow();
        stage.setScene(new Scene(load));
        stage.centerOnScreen();

    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("WindowA.fxml"));
        Stage stage = (Stage) contextB.getScene().getWindow();
        stage.setScene(new Scene(load));
        stage.centerOnScreen();
    }
}
