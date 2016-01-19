package Utils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lorenzo on 30/08/2015.
 */
public class Configuration {

    private static Configuration config = null;

    private final String setting = "settings.ini";
    private final String title = "InventoriX";

    private final double version = 0.01;

    private final  Map<String, ?> SettingsMap = new HashMap<>();

    private Configuration(File file){}

    private Configuration(){
        this(null);
    }

    void save(){}

    void load(){}

    <T> T getValue(String settingID){return  null;}

    <T> void setValue(String settingID , T value){}



    public static Configuration getConfigurator(){
        if(config != null) return config;
        config = new Configuration();
        return config;
    }

}
