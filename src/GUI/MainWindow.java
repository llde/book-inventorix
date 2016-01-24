package GUI;

import Back.Item;
import Back.Property;
import javafx.collections.ObservableList;


/**
 * Created by lorenzo on 19/01/16.
 */
public interface MainWindow extends GUI{

    void addProperty(Property<?> property);

    void addItem(Item item);

    boolean IsProjectLoaded();

}
