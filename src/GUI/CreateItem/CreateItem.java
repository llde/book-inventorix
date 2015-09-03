package GUI.CreateItem;

import GUI.Interface.GUI;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * Created by Lorenzo on 31/08/2015.
 */
public class CreateItem implements GUI{
    private Scene sc = null;
    public CreateItem(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("./CreateItem.fxml"));
            loader.setController(this);
            AnchorPane ancora = loader.load();
            sc = new Scene(ancora);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void HooksCallbacks(){

    }


    @Override
    public Scene getScene(){
        return sc;
    }
}
