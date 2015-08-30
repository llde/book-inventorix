package GUI.MainWindow;

import GUI.Interface.GUI;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

/**
 * Created by Lorenzo on 30/08/2015.
 */
public class MainWindow implements GUI{
    private Scene sc = null;
    public MainWindow(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("./MainWindow.fxml"));
            loader.setController(this);
            VBox ancora = loader.load();
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
