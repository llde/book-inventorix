package Back;

/**
 * Created by Lorenzo on 30/08/2015.
 */
public class ItemImpl {
    /*    //This is for Book Inventory, I want something more general
    private Property autore = null;
    private Property locazione = null;
    private Property fisicaodigitale = null;
    */

    private String nome = null;
    private PropertyImpl[] properties = null;


    public ItemImpl(String name , PropertyImpl... properties){
        this.nome = name;
        this.properties = properties;
    }

    public ItemImpl(){
        this(null);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PropertyImpl[] getProperties() {
        return properties;
    }

    public void setProperties(PropertyImpl[] properties) {
        this.properties = properties;
    }

}
