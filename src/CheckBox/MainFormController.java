package CheckBox;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;

import java.util.ArrayList;

public class MainFormController {
    public CheckBox chkbxJava;
    public CheckBox chkbxPython;
    public CheckBox chkbxRuby;

    public void printOnAction(ActionEvent actionEvent) {

        ArrayList<String> languages = new ArrayList<>();

        if(chkbxJava.isSelected()){
            languages.add("java");
        }
        if(chkbxPython.isSelected()){
            languages.add("Python");
        }
        if(chkbxRuby.isSelected()){
            languages.add("Ruby");
        }

        System.out.println(languages);

    }
}
