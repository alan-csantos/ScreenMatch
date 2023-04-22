import java.util.ArrayList;

import cursojava.screenmath.calculos.CalculadoraDeTempo;
import cursojava.screenmath.calculos.FiltroRecomendacao;
import cursojava.screenmath.modelos.Episodio;
import cursojava.screenmath.modelos.Filme;
import cursojava.screenmath.modelos.Serie;

public class App {
    public static void main(String[] args) throws Exception {
             
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        CalculadoraDeTempo minhaCalculadora = new CalculadoraDeTempo();
        Episodio episodio = new Episodio();
        ArrayList<Filme> listdaDeFilmes = new ArrayList<>();

        Filme meuFilme = new Filme("O Senhor dos Aneis - A sociedade do Anel", 2001);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.avalia(9.9);
        meuFilme.avalia(8.7);        
        meuFilme.exibeFichaTecnica();
        minhaCalculadora.inclui(meuFilme);
        System.out.println("Tempo Calculado Atual: " + minhaCalculadora.getTempoTotal());
        filtro.filtra(meuFilme);
        listdaDeFilmes.add(meuFilme);

        Filme outroFilme = new Filme("Matrix", 1998);
        outroFilme.setAnoDeLancamento(1998);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.avalia(9.9);
        outroFilme.avalia(8.7);        
        outroFilme.exibeFichaTecnica();
        minhaCalculadora.inclui(outroFilme);
        System.out.println("Tempo Calculado Atual: " + minhaCalculadora.getTempoTotal());
        listdaDeFilmes.add(outroFilme);

        Filme maisUmFilme = new Filme("Naufrago", 1998);
        maisUmFilme.setDuracaoEmMinutos(150);
        maisUmFilme.avalia(9.9);
        maisUmFilme.avalia(8.7);        
        maisUmFilme.exibeFichaTecnica();
        minhaCalculadora.inclui(maisUmFilme);
        System.out.println("Tempo Calculado Atual: " + minhaCalculadora.getTempoTotal());
        listdaDeFilmes.add(maisUmFilme);

        System.out.println("Tamanho da Lista: " + listdaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listdaDeFilmes.get(0).getNome());
        System.out.println(listdaDeFilmes                                                                                                                                                                                        );
        System.out.println("toString do Filme: " + listdaDeFilmes.get(0).toString());
        
        Serie minhaSerie = new Serie("A Casa do Dragão", 2022);
        minhaSerie.setTemporadas(2);
        minhaSerie.setEpisodeosPorTemporada(12);
        minhaSerie.setMinutosPorEpisodio(40);
        minhaSerie.avalia(10);
        minhaSerie.avalia(9);
        minhaSerie.exibeFichaTecnica();
        minhaCalculadora.inclui(minhaSerie);
        System.out.println("Tempo Calculado Atual: " + minhaCalculadora.getTempoTotal());
        System.out.println("Duração da Série: " + minhaSerie.getDuracaoEmMinutos());
        episodio.setNome("Porto Real");
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalDeVisualizacoes(300);
        System.out.println("Serie com " + episodio.getClassificacao() + " Estrelas");
        filtro.filtra(episodio);

        



    }
}
