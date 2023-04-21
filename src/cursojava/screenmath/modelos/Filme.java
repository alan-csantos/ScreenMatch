package cursojava.screenmath.modelos;

import cursojava.screenmath.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    
    @Override
    public int getClassificacao(){
        return 0;
    }

}
