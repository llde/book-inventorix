package GUI.MainWindow;

import Back.Item;
import Back.Property;
import GUI.Interface.GUI;
import GUI.UIDispatcher;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Lorenzo on 30/08/2015.
 */
public class MainWindow implements GUI{
    @FXML
    private Button AddPropertyButton;
    @FXML
    private Button ButtonNew;
    @FXML
    private Button ButtonSave;
    @FXML
    private Button ButtonLoad;
    @FXML
    private ChoiceBox<Property> PropBox;
    @FXML
    private TextField filter;
    @FXML
    private TableView<Item> invView;


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

    public void HookCallbacks(){
        UIDispatcher disp = UIDispatcher.getDispatcher();
        AddPropertyButton.setOnAction((e) -> ((Stage) this.sc.getWindow()).setScene(disp.getPropertynew().getScene()));
    }



    @Override
    public Scene getScene(){
        return sc;
    }
}
