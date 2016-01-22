package GUI.Implements;

import Back.Item;
import Back.ItemImpl;
import Back.Property;
import GUI.UIDispatcher;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * Created by Lorenzo on 31/08/2015.
 */
public class CreateItemImpl implements GUI.CreateItem{
    @FXML
    private Button ButtonOk;
    @FXML
    private Button ButtonAbort;
    @FXML
    private TableView<Property<?>> TableProperty;
    @FXML
    private TextField NameText;


    private Scene sc = null;
    public CreateItemImpl(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CreateItem.fxml"));
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
