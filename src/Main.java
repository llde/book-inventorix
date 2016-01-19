import Back.Item;
import Back.ItemImpl;
import GUI.UIDispatcher;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by Lorenzo on 30/08/2015.
 */
public class Main  extends Application{
    public static void main(String[] args){
        //PreFX configurationfile init.
        launch(args);
        //PostFX  hook crash javaFX thread
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        UIDispatcher dis = UIDispatcher.getDispatcher();
        primaryStage.setScene(dis.getMainwin().getScene());
        primaryStage.show();
    }


}
