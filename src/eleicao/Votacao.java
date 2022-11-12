package eleicao;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Votacao implementa a listagem de votos validos, nulos e brancos. Alem disso, provê métodos para gerar a
 * porcentagem de cada tipo voto sobre o total dos votos (validos, nulos e brancos).
 */
@Data
public class Votacao {
    /**
     * Lista utilizada para armazenar votos validos.
     */
    private List<Voto> validos = new ArrayList<>();

    /**
     * Lista utilizada para armazenar votos nulos.
     */
    private List<Voto> nulos = new ArrayList<>();

    /**
     * Lista utilizada para armazenar votos brancos.
     */
    private List<Voto> brancos = new ArrayList<>();

    /**
     * Construtor
     */
    public Votacao(){}

    /**
     * Total de votos (validos + nulos + brancos)
     * @return int
     */
    private int getTotal(){
        return this.validos.size() + this.nulos.size() + this.brancos.size();
    }

    /**
     * Percentual de votos validos com relação ao total.
     * @return float
     */
    public float getPercentualValidos(){
        return (float) this.validos.size() / this.getTotal();
    }

    /**
     * Percentual de votos brancos com relação ao total
     * @return float
     */
    public float getPercentualBrancos(){
        return (float) this.brancos.size() / this.getTotal();
    }

    /**
     * Percentual de votos nulos com relação ao total.
     * @return float
     */
    public float getPercentualNulos(){
        return (float) this.nulos.size() / this.getTotal();
    }

    /**
     * Insere um voto valido.
     * @param Voto voto
     */
    public void inserirVotoValido(Voto voto){
        this.validos.add(voto);
    }

    /**
     * Insere um voto nulo.
     * @param Voto voto
     */
    public void inserirVotoNulo(Voto voto){
        this.nulos.add(voto);
    }

    /**
     * Insere um voto branco.
     * @param Voto voto
     */
    public void inserirVotoBranco(Voto voto){
        this.brancos.add(voto);
    }

}
