package cursojava.screenmath.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodeosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public boolean isAtiva() {
        return ativa;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    public int getEpisodeosPorTemporada() {
        return episodeosPorTemporada;
    }
    public void setEpisodeosPorTemporada(int episodeosPorTemporada) {
        this.episodeosPorTemporada = episodeosPorTemporada;
    }
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return this.temporadas 	* this.minutosPorEpisodio 	+ this.episodeosPorTemporada;    
    }

    @Override
    public String toString() {
        
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento()+")";
    }

    
}
