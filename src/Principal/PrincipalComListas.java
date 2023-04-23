package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import cursojava.screenmath.modelos.Filme;
import cursojava.screenmath.modelos.Serie;
import cursojava.screenmath.modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args){
        ArrayList<Titulo> listaAssistidos = new ArrayList<>();

        Filme meuFilme = new Filme("O Senhor dos Aneis - A sociedade do Anel", 2001);
        meuFilme.avalia(10);
        listaAssistidos.add(meuFilme);

        Filme outroFilme = new Filme("Matrix", 1998);
        outroFilme.avalia(9);
        listaAssistidos.add(outroFilme);

        Filme maisUmFilme = new Filme("Naufrago", 1998);
        maisUmFilme.avalia(7);
        listaAssistidos.add(maisUmFilme);

        Serie minhaSerie = new Serie("A Casa do Dragão", 2022);
        listaAssistidos.add(minhaSerie);

        for (Titulo item : listaAssistidos) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme){                
                System.out.println("Classificação: " + filme.getClassificacao());
            }            
        }

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Adam Sandler");
        buscaPorArtistas.add("Leonardo DiCaprio");
        buscaPorArtistas.add("Meryl Streep");
        buscaPorArtistas.add("Tom Hanks");
        buscaPorArtistas.add("Brad Pitt");
        buscaPorArtistas.add("Jennifer Lawrence");
        buscaPorArtistas.add("Robert De Niro");
        buscaPorArtistas.add("Angelina Jolie");
        buscaPorArtistas.add("Will Smith");
        buscaPorArtistas.add("Scarlett Johansson");
        buscaPorArtistas.add("Denzel Washington");
        System.out.println("Lista Desordenada");
        System.out.println(buscaPorArtistas);
        System.out.println("Lista Ordenada");
        Collections.sort(buscaPorArtistas);
        System.out.println(buscaPorArtistas);

        System.out.println("Lista de Titulos Ordenados por nome");
        Collections.sort(listaAssistidos);
        System.out.println(listaAssistidos);

        listaAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista de Titulos Ordenados por ano de lançamento");
        System.out.println(listaAssistidos);

    }
}
