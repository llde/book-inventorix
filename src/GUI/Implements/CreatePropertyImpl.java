package GUI.Implements;

import GUI.CreateProperty;
import GUI.UIDispatcher;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Created by Lorenzo on 31/08/2015.
 */


public class CreatePropertyImpl implements CreateProperty {
    @FXML
    private Button ButtonOk;
    @FXML
    private Button ButtonCancel;
    @FXML
    private TextField TextName;
    @FXML
    private TextField TextType;
    @FXML
    private TextField TextValueDef;

    private Scene sc = null;

    public CreatePropertyImpl() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CreateProperty.fxml"));
            loader.setController(this);
            AnchorPane ancora = loader.load();
            sc = new Scene(ancora);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void HookCallbacks(){
        UIDispatcher  disp = UIDispatcher.getDispatcher();
        ButtonOk.setOnAction((event) ->{
            try {
                ((Stage)sc.getWindow()).setScene(disp.getMainwin().getScene());
            }  catch (Exception e) {
                e.printStackTrace();
            }
        });
        ButtonCancel.setOnAction(event -> ((Stage)sc.getWindow()).setScene(disp.getMainwin().getScene()));
    }

    @Override
    public Scene getScene() {
        return sc;
    }

}
