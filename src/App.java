import cursojava.screenmath.modelos.Filme;

public class App {
    public static void main(String[] args) throws Exception {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Senhor dos Aneis - A sociedade do Anel");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.avalia(9.9);
        meuFilme.avalia(8.7);

        
        meuFilme.exibeFichaTecnica();


    }
}
