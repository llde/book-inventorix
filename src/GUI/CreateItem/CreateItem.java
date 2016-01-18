package GUI.CreateItem;

import Back.ItemImpl;
import Back.PropertyImpl;
import GUI.Interface.GUI;
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
import javafx.stage.Stage;

/**
 * Created by Lorenzo on 31/08/2015.
 */
public class CreateItem implements GUI{
    @FXML
    private Button ButtonOk;
    @FXML
    private Button ButtonAbort;
    @FXML
    private TableView<PropertyImpl> TableProperty;
    @FXML
    private TextField NameText;


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
        UIDispatcher disp = UIDispatcher.getDispatcher();
        //TODO need to poulate the TableProperty
        ButtonAbort.setOnAction((ev) -> ((Stage)sc.getWindow()).setScene(disp.getMainwin().getScene()));
        ButtonOk.setOnAction((ev) -> {
            String name = NameText.getText();
            PropertyImpl[] properties = TableProperty.getItems().toArray(new PropertyImpl[TableProperty.getItems().size()]);
            ItemImpl it = new ItemImpl(name, properties);
            disp.getMainwin().getItems().add(it);
            ((Stage) sc.getWindow()).setScene(disp.getMainwin().getScene());
        });

        TableProperty.getColumns().get(0).setCellValueFactory((data) -> (ObservableValue) new SimpleStringProperty(data.getValue().getNome()));
        TableProperty.getColumns().get(1).setCellValueFactory((data) -> (ObservableValue) new SimpleStringProperty(data.getValue().getValore()));
    }


    public ObservableList<PropertyImpl> getListProperty(){return TableProperty.getItems();}

    @Override
    public Scene getScene(){
        return sc;
    }
}
