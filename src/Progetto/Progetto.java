package Progetto;

import Back.Item;
import Back.Property;

import java.util.List;
import java.util.UUID;

/**
 * Created by Lorenzo on 19/01/2016.
 */
public interface Progetto {

    List<Item> getItems();

    List<Property<?>> getProperty();

    void addItem(Item it);

    <T> void addProperty(Property<T> property);

    UUID getUUID();

    <T> T save();

    void dispose();



}
