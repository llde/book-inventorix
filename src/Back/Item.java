package Back;

/**
 * Created by Lorenzo on 30/08/2015.
 */
public class Item {
    /*    //This is for Book Inventory, I want something more general
    private Property autore = null;
    private Property locazione = null;
    private Property fisicaodigitale = null;
    */

    private String nome = null;
    private Property[] properties = null;


    public Item(String name , Property... properties){
        this.nome = name;
        this.properties = properties;
    }

    public Item(){
        this(null);
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Property[] getProperties() {
        return properties;
    }

    public void setProperties(Property[] properties) {
        this.properties = properties;
    }

}
