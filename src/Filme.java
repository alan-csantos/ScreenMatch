public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somdaDasAvaliacoes;
    int totalDeAvaliacao;
    int duracaoEmMinutos;    

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração em Minutos: " + duracaoEmMinutos); 
        System.out.println("Total de Avaliações: " + totalDeAvaliacao); 
        System.out.println("Media de Avaliações: " + retornaMedia());     
    }

    void avalia(double nota){
        somdaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    double retornaMedia(){
        return (somdaDasAvaliacoes / totalDeAvaliacao);
    }
}
