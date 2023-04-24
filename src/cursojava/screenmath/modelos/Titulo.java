package cursojava.screenmath.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somdaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;  
    
    


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) { 		
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomdaDasAvaliacoes() {
        return somdaDasAvaliacoes;
    }

    public int getTotalDeAvaliações() {
        return totalDeAvaliacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
                this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do Titulo: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração em Minutos: " + duracaoEmMinutos); 
        System.out.println("Total de Avaliações: " + totalDeAvaliacao); 
        System.out.println("Media de Avaliações: " + retornaMedia());     
    }

    public void avalia(double nota){
        somdaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double retornaMedia(){
        return (somdaDasAvaliacoes / totalDeAvaliacao);
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString(){
        return "Nome: '" + this.nome + '\'' + ", ano de Lançamento " + this.anoDeLancamento + ", " + "duração: " + this.duracaoEmMinutos;
    }
    
}
