package Back;


/**
 * Created by Lorenzo on 18/01/2016.
 */
interface Property<T> {

    T getValue();

    void setValue();

    String getPropertyName();

    String getPropertyID();

    boolean isOrdinalble();

    @Override
    boolean equals(Object other);
}
