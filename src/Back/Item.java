package Back;

import com.sun.javafx.UnmodifiableArrayList;

/**
 * Created by Lorenzo on 18/01/2016.
 */
public interface Item {


    <T> T getField(String property);

    <T> T getField(Property property);


    <T> boolean setField(String property , T  value);

    <T> boolean setField(Property property, T value);

    UnmodifiableArrayList<Property> getProperties();

    void addProperty(Property property);

    void removeProperty(Property property);

    @Override
    boolean equals(Object object);
}
