package Progetto;

import Back.Item;
import Back.Property;
import javafx.collections.ObservableList;

import java.util.List;
import java.util.UUID;

/**
 * Created by Lorenzo on 19/01/2016.
 */
public interface Progetto {

    ObservableList<Item> getItems();

    ObservableList<Property<?>> getProperty();

    void addItem(Item it);

    <T> void addProperty(Property<T> property);

    UUID getUUID();

    <T> T save();

    void dispose();

    String getName();

    Boolean getSaved();



}
