package Utils;

import lombok.Getter;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lorenzo on 30/08/2015.
 */
public class Configuration {

    public class Setting<T>{
        private String ID;
        private T value;

        public Setting(String ID, T value){
            this.ID = ID;
            this.value = value;
        }

        public String getID() {
            return ID;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        @Override
        public String toString(){
            return ID + ":"  + value.toString();
        }
    }


    @Getter(lazy=true) private static final Configuration config = new Configuration();

    private final String setting = "settings.ini";
    public final String title = "InventoriX";

    public final double version = 0.01;

    private final  Map<String, ?> SettingsMap = new HashMap<>();

    private Configuration(File file){}

    private Configuration(){
        this(null);
    }

    void save(){}

    void load(){}

    <T> T getValue(String settingID){return  null;}

    <T> void setValue(String settingID , T value){}

}
