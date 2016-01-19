package GUI;

import javafx.beans.property.Property;
import javafx.collections.ObservableList;

/**
 * Created by lorenzo on 19/01/16.
 */
public interface CreateProperty extends GUI{

    ObservableList<Property<?>> getProperties();


}
