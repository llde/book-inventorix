package Progetto;

import Back.Item;
import Back.Property;
import javafx.collections.FXCollections;

import java.util.List;
import java.util.UUID;

/**
 * Created by Lorenzo on 24/01/2016.
 */
class ProgettoImpl implements Progetto {

    private List<Property<?>> propertyList = FXCollections.observableArrayList();
    private List<Item>  itemList = FXCollections.observableArrayList();











    @Override
    public List<Item> getItems() {
        return itemList;
    }

    @Override
    public List<Property<?>> getProperty() {
        return propertyList;
    }

    @Override
    public void addItem(Item it) {

    }

    @Override
    public <T> void addProperty(Property<T> property) {

    }

    @Override
    public UUID getUUID() {
        return null;
    }

    @Override
    public <T> T save() {
        return null;
    }

    @Override
    public void dispose() {

    }
}
