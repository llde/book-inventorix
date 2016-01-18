package Back;

import javax.xml.ws.FaultAction;

/**
 * Created by Lorenzo on 18/01/2016.
 */
public class BackFactory {


    //TODO se permettiamo, o ammettiamo un estensione che permette più progetti aperti contemporaneamente
    //TODO permettere ad ogni progetto una BackFactory associata?
    static ItemFactory itemf = null;

    static PropertyFactory propertyf = null;

    @FunctionalInterface
    interface ItemFactory{
        Item newInstance();
    }

    @FunctionalInterface
    interface PropertyFactory{
        <T> Property<T> newInstance();
    }

    public Item getItem(){
        if(itemf != null) return itemf.newInstance();
        return new ItemImpl();
    }

    public <T> Property<T> getProeprty(){
        if(propertyf != null) return propertyf.newInstance();
        return new PropertyImpl<>();
    }
}
