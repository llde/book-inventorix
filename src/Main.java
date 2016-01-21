import Back.Item;
import Back.ItemImpl;
import GUI.UIDispatcher;
import Utils.Configuration;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by Lorenzo on 30/08/2015.
 */
public class Main  extends Application{

    public static void main(String[] args){
        //PreFX configurationfile init.
        //Preloader
        PreFX();
        launch(args);
        //PostFX  hook crash javaFX thread
    }


    public static void PreFX(){
        Configuration.getConfigurator();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        UIDispatcher dis = UIDispatcher.getDispatcher();
        primaryStage.setTitle( Configuration.getConfigurator().title + " " + Configuration.getConfigurator().version);
        primaryStage.setScene(dis.getMainwin().getScene());
        primaryStage.show();
    }


}
