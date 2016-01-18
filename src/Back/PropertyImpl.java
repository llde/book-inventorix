package Back;

/**
 * Created by Lorenzo on 30/08/2015.
 */
public class PropertyImpl {
    private String nome = null;
    private String tipo = null;
    private String valore  = null;
    private Class classe = null;


    public PropertyImpl(String nome, Class classe, String valore ){
        this.nome = nome;
        this.classe = classe;
        this.valore = valore;
    }

    public PropertyImpl(){
        this(null,null,null);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Class getClasse() {
        return classe;
    }

    public void setClasse(Class classe) {
        this.classe = classe;
    }

    public String getValore() {
        return valore;
    }

    public void setValore(String valore) {
        this.valore = valore;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
