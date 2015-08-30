package GUI.CreateProperty;

import GUI.Interface.GUI;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * Created by Lorenzo on 31/08/2015.
 */
public class CreateProperty implements GUI {
    private Scene sc = null;
    public CreateProperty(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("./CreateProperty.fxml"));
            loader.setController(this);
            AnchorPane ancora = loader.load();
            sc = new Scene(ancora);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Scene getScene(){
        return sc;
    }

}
