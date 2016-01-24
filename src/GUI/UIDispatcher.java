package GUI;

import GUI.Implements.CreateItemImpl;
import GUI.Implements.CreatePropertyImpl;
import GUI.Implements.MainWindowImpl;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.UtilityClass;

/**
 * Created by Lorenzo on 30/08/2015.
 */
@UtilityClass
public class UIDispatcher {
    /*
    * Generify with setters
    */
    @Getter(lazy=true) private static final MainWindow mainwin = new MainWindowImpl();
    @Getter(lazy=true) private static final CreateProperty propertynew = new CreatePropertyImpl();
    @Getter(lazy=true) private static final CreateItem itemnew = new CreateItemImpl();
    @Getter @Setter private static Stage prStage = null;

}
