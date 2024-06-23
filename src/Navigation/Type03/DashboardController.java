package Navigation.Type03;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DashboardController {
    public AnchorPane loadContext;

    public void initialize() throws IOException {
        setUI("windowA");
    }

    public void windowAonAction(ActionEvent actionEvent) throws IOException {
        setUI("WindowA");
    }

    public void windowBOnAction(ActionEvent actionEvent) throws IOException {
       setUI("WindowB");
    }

    private void setUI(String location) throws IOException {
        loadContext.getChildren().clear();
        loadContext.getChildren().add(FXMLLoader.load(getClass().getResource(location+".fxml")));
    }
}
