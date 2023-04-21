package cursojava.screenmath.modelos;
import cursojava.screenmath.calculos.Classificavel;

public class Episodio implements Classificavel{
    private int numero;
    private String nome;
    private Serie serie;
    private int totalDeVisualizacoes;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Serie getSerie() {
        return serie;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalDeVisualizacoes() {
        return totalDeVisualizacoes;
    }
    public void setTotalDeVisualizacoes(int totalDeVisualizacoes) {
        this.totalDeVisualizacoes = totalDeVisualizacoes;
    }

    
    @Override
    public int getClassificacao() {
        if (totalDeVisualizacoes >= 100){
            return 5;
        }
        if (totalDeVisualizacoes >= 75 && totalDeVisualizacoes < 100){
            return 4;
        }
        if (totalDeVisualizacoes > 50 && totalDeVisualizacoes < 75){
            return 3;
        }
        if (totalDeVisualizacoes >= 25 && totalDeVisualizacoes < 50){
            return 2;
        }
        else{
            return 1;
        }

    }


    

}
