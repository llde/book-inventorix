package GUI;

import GUI.Implements.CreateItemImpl;
import GUI.Implements.CreatePropertyImpl;
import GUI.Implements.MainWindowImpl;
import lombok.Getter;

/**
 * Created by Lorenzo on 30/08/2015.
 */
public class UIDispatcher {

    @Getter(lazy=true) private static final UIDispatcher dispatcher = new UIDispatcher();
    @Getter(lazy=true) private final MainWindowImpl mainwin = new MainWindowImpl();
    @Getter(lazy=true) private final CreatePropertyImpl propertynew = new CreatePropertyImpl();
    @Getter(lazy=true) private final CreateItemImpl itemnew = new CreateItemImpl();

    private UIDispatcher(){}

}
