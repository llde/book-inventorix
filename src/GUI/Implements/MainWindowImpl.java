package GUI.Implements;

import Back.Item;
import Back.Property;
import GUI.UIDispatcher;
import Progetto.Progetto;
import Progetto.ProgettoFactory;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Lorenzo on 30/08/2015.
 */
public class MainWindowImpl implements GUI.MainWindow {
    @FXML
    private Button AddPropertyButton;
    @FXML
    private Button ButtonNew;
    @FXML
    private Button ButtonSave;
    @FXML
    private Button ButtonLoad;
    @FXML
    private ChoiceBox<Property<?>> PropBox;
    @FXML
    private TextField filter;
    @FXML
    private TableView<Item> invView;

    private Scene sc = null;

    private Progetto proj = null;

    public MainWindowImpl() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
            loader.setController(this);
            VBox ancora = loader.load();
            proj = ProgettoFactory.getProject("Prova");
            AddPropertyButton.setOnAction((event) ->{
                UIDispatcher.getPrStage().setScene(UIDispatcher.getPropertynew().getScene());
            });
            sc = new Scene(ancora);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





    @Override
    public Scene getScene() {
        return sc;
    }


    @Override
    public void addProperty(Property<?> property) {

    }

    @Override
    public void addItem(Item item) {

    }

    @Override
    public <T> void ModProperty(Property<T> property, T value) {

    }

    @Override
    public boolean IsProjectLoaded() {
        return proj != null;
    }
}