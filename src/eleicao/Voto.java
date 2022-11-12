package eleicao;
import lombok.Data;

/**
 * Classe utilizada para representar um voto.
 * Foi pensada para que seja possível agregar mais informações caso necessário, como o exemplo do parâmetro candidato.
 */
@Data
public class Voto {
    private String candidato;

    /**
     * Construtor
     */
    public Voto(){
    }
}
