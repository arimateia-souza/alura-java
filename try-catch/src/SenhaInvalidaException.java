public class SenhaInvalidaException extends RuntimeException{
    private String mensagem;
    SenhaInvalidaException(String mensagem){
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
