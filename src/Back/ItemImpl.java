package Back;

import com.sun.javafx.UnmodifiableArrayList;

/**
 * Created by Lorenzo on 30/08/2015.
 */
public class ItemImpl implements Item{
    /*    //This is for Book Inventory, I want something more general
    private Property autore = null;
    private Property locazione = null;
    private Property fisicaodigitale = null;
    */

    private String nome = null;
    private PropertyImpl[] properties = null;


    public ItemImpl(String name , PropertyImpl... properties){
        this.nome = name;
        this.properties = properties;
    }

    public ItemImpl(){
        this(null);
    }


    @Override
    public <T> T getField(String property) {
        return null;
    }

    @Override
    public <T> T getField(Property property) {
        return null;
    }

    @Override
    public <T> boolean setField(String property, T value) {
        return false;
    }

    @Override
    public <T> boolean setField(Property property, T value) {
        return false;
    }

    @Override
    public UnmodifiableArrayList<Property> getProperties() {
        return null;
    }

    @Override
    public void addProperty(Property property) {

    }

    @Override
    public void removeProperty(Property property) {

    }
}
