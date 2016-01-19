package Utils;


import java.util.AbstractMap;
import java.util.Map;

/**
 * Created by lorenzo on 19/01/16.
 */
public class SaveLoadFactory {

    @FunctionalInterface
    interface SaveLoadInstanceFactory{
        Map.Entry<Save,Load>  newInstance();
    }

    private SaveLoadInstanceFactory fact = null;


    public Map.Entry<Save,Load> GetSaveLoad(){
        return    null; // new AbstractMap.SimpleImmutableEntry<Save, Load>()
    }


}
