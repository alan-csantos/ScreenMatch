public class App {
    public static void main(String[] args) throws Exception {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Senhor dos Aneis - A sociedade do Anel";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.avalia(9.7);
        meuFilme.avalia(8.7);
        
        
        meuFilme.exibeFichaTecnica();


    }
}
