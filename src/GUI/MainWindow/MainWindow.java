package GUI.MainWindow;

import Back.Item;
import Back.Property;
import GUI.Interface.GUI;
import GUI.UIDispatcher;
import javafx.collections.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

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

    private ObservableSet<Property> listprop;
    private Scene sc = null;

    public MainWindow(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("./MainWindow.fxml"));
            loader.setController(this);
            VBox ancora = loader.load();
            listprop = FXCollections.observableSet();
            listprop.addListener(new SetChangeListener<Property>() {   //Mandare tutto nel HookCallBack
                @Override
                public void onChanged(Change<? extends Property> c) {
                    Property added = c.getElementAdded();
                    TableColumn<Item, String> nuovacolonna =  new TableColumn<>(added.getNome());
            //        nuovacolonna.setCellValueFactory((cellData)-> cellData.getValue().toString() );
                    invView.getColumns().add(nuovacolonna);
                }
            });
            Property name = new Property("Nome", String.class, "");
            listprop.add(name);
            sc = new Scene(ancora);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void HookCallbacks(){
        UIDispatcher disp = UIDispatcher.getDispatcher();
        AddPropertyButton.setOnAction((e) -> ((Stage) this.sc.getWindow()).setScene(disp.getPropertynew().getScene()));
        invView.setOnContextMenuRequested((event) ->{
            MenuItem nuovo = new MenuItem("New");
            MenuItem canc = new MenuItem("Delete");
            nuovo.setOnAction((evento)-> ((Stage)sc.getWindow()).setScene(UIDispatcher.getDispatcher().getItemnew().getScene()));
            ContextMenu menu = new ContextMenu(nuovo,canc);
            menu.setAutoHide(true);
            menu.setAutoFix(true);
            menu.setAnchorX(event.getScreenX());
            menu.setAnchorY(event.getScreenY());
            menu.setConsumeAutoHidingEvents(true);
            menu.show(this.sc.getWindow());
        });
    }



    @Override
    public Scene getScene(){
        return sc;
    }


    public ObservableSet<Property> GetPropertyList(){
        return listprop;
    }
}
