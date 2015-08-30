package GUI;

import GUI.MainWindow.MainWindow;

/**
 * Created by Lorenzo on 30/08/2015.
 */
public class UIDispatcher {
    private static UIDispatcher dispatcher = null;

    private MainWindow mainwin = null;




    private UIDispatcher(){
        mainwin = new MainWindow();
    }

    public MainWindow getMainwin(){
        return mainwin;
    }

    public static UIDispatcher getDispatcher(){
        if(dispatcher ==  null) {
            dispatcher = new UIDispatcher();
        }
        return dispatcher;
    }

}
