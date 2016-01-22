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
        Configuration.getConfig();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle(Configuration.getConfig().title + " " + Configuration.getConfig().version);
        primaryStage.setScene(UIDispatcher.getMainwin().getScene());
        primaryStage.show();
    }


}
