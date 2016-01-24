package Utils;


import java.util.AbstractMap;
import java.util.Map;

/**
 * Created by lorenzo on 19/01/16.
 */
public class SaveLoadFactory {

    @FunctionalInterface
    interface SaveInstanceFactory{
        Save  newInstance();
    }

    @FunctionalInterface
    interface LoadInstanceFactory{
        Load newInstance();
    }

    private SaveInstanceFactory save = null;
    private LoadInstanceFactory load = null;


    public Load GetLoad(){
        return null;    }

    public Save  getSave(){ return null;}
}
