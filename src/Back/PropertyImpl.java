package Back;

/**
 * Created by Lorenzo on 30/08/2015.
 */
public class PropertyImpl<T> implements Property<T>{

    private String nome = null;
    private String ID = null;
    private T valore  = null;


    public PropertyImpl(String nome, T valore ){
        this.nome = nome;
        this.valore = valore;
    }

    public PropertyImpl(){
        this(null,null);
    }

    @Override
    public T getValue() {
        return valore;
    }

    @Override
    public void setValue() {

    }

    @Override
    public String getPropertyName() {
        return null;
    }

    @Override
    public String getPropertyID() {
        return null;
    }

    @Override
    public boolean isOrdinalble() {
        return false;
    }
}
