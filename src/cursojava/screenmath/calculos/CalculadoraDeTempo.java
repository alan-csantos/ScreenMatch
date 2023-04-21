package cursojava.screenmath.calculos;

import cursojava.screenmath.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos(); 
    }


}
