package Progetto;

import lombok.experimental.UtilityClass;

/**
 * Created by Lorenzo on 24/01/2016.
 */
@UtilityClass
public class ProgettoFactory {

    private static ProjectFactory fact = null;

    @FunctionalInterface
    interface ProjectFactory{
        Progetto newInstance(String name);
    }


    public Progetto getProject(String name){
        if(fact != null) return fact.newInstance(name);
        return new ProgettoImpl(name);
    }
}
