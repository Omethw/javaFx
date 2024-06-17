package first;

import javafx.application.Application;
import javafx.stage.Stage;

import java.net.URL;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Catch Fxml File
        URL resource = getClass().getResource("MainForm.fxml");
    }
}
