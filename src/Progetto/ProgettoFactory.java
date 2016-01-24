package Progetto;

/**
 * Created by Lorenzo on 24/01/2016.
 */
public class ProgettoFactory {

    private static ProjectFactory fact = null;

    @FunctionalInterface
    interface ProjectFactory{
        Progetto newInstance();
    }


    public Progetto getProject(){
        if(fact != null) return fact.newInstance();
        return new ProgettoImpl();
    }
}
