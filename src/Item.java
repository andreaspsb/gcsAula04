import java.util.Date;
import java.util.ArrayList;

public class Item {
    private String id, nome;
    private ArrayList<String> autores = new ArrayList<String>();
    private Date dataAquisicao;

    public String getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public Date getDataAquisicao() {
        return this.dataAquisicao;
    }
}
