package Progetto;

import Back.Item;
import Back.Property;
import java.io.File;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.UUID;

/**
 * Created by Lorenzo on 24/01/2016.
 */
class ProgettoImpl implements Progetto {

    private String nome = "" ;
    private Boolean saved = false;
    private ObservableList<Property<?>> propertyList = null;
    private ObservableList<Item>  itemList = null;



    ProgettoImpl(String name){
        nome = name;
        propertyList = FXCollections.observableArrayList();
        itemList = FXCollections.observableArrayList();
    }

    ProgettoImpl(File f){}


    @Override
    public ObservableList<Item> getItems() {
        return itemList;
    }

    @Override
    public ObservableList<Property<?>> getProperty() {
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

    @Override
    public String getName() {
        return nome;
    }

    @Override
    public Boolean getSaved() {
        return saved;
    }
}
