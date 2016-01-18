package GUI.MainWindow;

import Back.ItemImpl;
import Back.PropertyImpl;
import GUI.Interface.GUI;
import GUI.UIDispatcher;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
    private ChoiceBox<PropertyImpl> PropBox;
    @FXML
    private TextField filter;
    @FXML
    private TableView<ItemImpl> invView;

    private ObservableSet<PropertyImpl> listprop;
    private Scene sc = null;

    public MainWindow(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("./MainWindow.fxml"));
            loader.setController(this);
            VBox ancora = loader.load();
            listprop = FXCollections.observableSet();
            listprop.addListener(new SetChangeListener<PropertyImpl>() {   //Mandare tutto nel HookCallBack
                @Override
                public void onChanged(Change<? extends PropertyImpl> c) {
                    PropertyImpl added = c.getElementAdded();
                    TableColumn<ItemImpl, String> nuovacolonna =  new TableColumn<>(added.getNome());
                    nuovacolonna.setCellValueFactory((cellData) -> new SimpleStringProperty(added.getValore()));
                    invView.getColumns().add(nuovacolonna);
                }
            });
            PropertyImpl name = new PropertyImpl("Tipo", String.class, "");
            listprop.add(name);
            sc = new Scene(ancora);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void HookCallbacks(){
        TableColumn<ItemImpl,String> col = new TableColumn<>("Name");
        col.setCellValueFactory((data)-> new SimpleStringProperty(data.getValue().getNome()));
        invView.getColumns().add(col);
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


    public ObservableSet<PropertyImpl> GetPropertyList(){
        return listprop;
    }


    public ObservableList<ItemImpl> getItems() {
        return invView.getItems();
    }
}
