package GUI;

import Back.Item;
import Back.Property;
import javafx.collections.ObservableList;


/**
 * Created by lorenzo on 19/01/16.
 */
public interface MainWindow extends GUI{

    ObservableList<Item>  getItems();

    Item getItem(String nameProperty);

    ObservableList<Property<?>> getProperties();

    void addItem(Item item);

    <T> void addProperty(Property<T> property);

    <T> void setItemProperty(Item item, Property<T> property, T value);


}
