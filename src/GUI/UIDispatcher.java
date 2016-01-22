package GUI;

import GUI.Implements.CreateItem;
import GUI.Implements.CreateProperty;
import GUI.Implements.MainWindow;
import lombok.Getter;

/**
 * Created by Lorenzo on 30/08/2015.
 */
public class UIDispatcher {
    @Getter(lazy=true) private static final UIDispatcher dispatcher = new UIDispatcher();

    private MainWindow mainwin = null;
    private CreateProperty propertynew = null;
    private CreateItem itemnew = null;



    private UIDispatcher(){
        mainwin = new MainWindow();
        propertynew = new CreateProperty();
        itemnew = new CreateItem();
    }

    private void HooksCallBack(){
        mainwin.HookCallbacks();
        propertynew.HookCallbacks();
        itemnew.HooksCallbacks();
    }

    public MainWindow getMainwin(){
        return mainwin;
    }


    public CreateItem getItemnew() {
        return itemnew;
    }

    public CreateProperty getPropertynew() {
        return propertynew;
    }
}
