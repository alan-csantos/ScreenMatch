package cursojava.screenmath.modelos;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    public String mensagem;

    public ErroDeConversaoDeAnoException(String mensagem){
        this.mensagem = mensagem;
    }
    
    public String getMenssage(){
        return this.mensagem;
    }
}
