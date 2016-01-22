package GUI;

import GUI.Implements.CreateItemImpl;
import GUI.Implements.CreatePropertyImpl;
import GUI.Implements.MainWindowImpl;
import lombok.Getter;
import lombok.experimental.UtilityClass;

/**
 * Created by Lorenzo on 30/08/2015.
 */
@UtilityClass
public class UIDispatcher {

    @Getter(lazy=true) private static final MainWindowImpl mainwin = new MainWindowImpl();
    @Getter(lazy=true) private static final CreatePropertyImpl propertynew = new CreatePropertyImpl();
    @Getter(lazy=true) private static final CreateItemImpl itemnew = new CreateItemImpl();

}
