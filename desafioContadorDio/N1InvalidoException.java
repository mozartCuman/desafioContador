package desafioContadorDio;

class N1InvalidoException extends Exception {
    public N1InvalidoException() {
        super("O primeiro número é maior que o segundo. Não é possível realizar uma contagem progressiva.");
    }
}
