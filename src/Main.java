import eleicao.Votacao;
import eleicao.Voto;

public class Main {
    public static void main(String[] args) {

        Votacao votacao = new Votacao();

        int qtdValidos = 15;
        int qtdBrancos = 4;
        int qtdNulos = 2;

        for (var i = 0; i < qtdValidos; i++)
            votacao.inserirVotoValido(new Voto());

        for (var i = 0; i < qtdBrancos; i++)
            votacao.inserirVotoBranco(new Voto());

        for (var i = 0; i < qtdNulos; i++)
            votacao.inserirVotoNulo(new Voto());

        System.out.printf("Validos: %,.2f%% \n", votacao.getPercentualValidos()*100);
        System.out.printf("Brancos: %,.2f%% \n", votacao.getPercentualBrancos()*100);
        System.out.printf("Nulos: %,.2f%% \n", votacao.getPercentualNulos()*100);
    }
}