package Principal;

import java.util.ArrayList;

import cursojava.screenmath.modelos.Filme;
import cursojava.screenmath.modelos.Serie;
import cursojava.screenmath.modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args){
        ArrayList<Titulo> listaAssistidos = new ArrayList<>();
        Filme meuFilme = new Filme("O Senhor dos Aneis - A sociedade do Anel", 2001);
        listaAssistidos.add(meuFilme);

        Filme outroFilme = new Filme("Matrix", 1998);
        listaAssistidos.add(outroFilme);

        Filme maisUmFilme = new Filme("Naufrago", 1998);
        listaAssistidos.add(maisUmFilme);

        Serie minhaSerie = new Serie("A Casa do Dragão", 2022);
        listaAssistidos.add(minhaSerie);

        for (Titulo item : listaAssistidos) {
            System.out.println(item);
        }

    }
}
