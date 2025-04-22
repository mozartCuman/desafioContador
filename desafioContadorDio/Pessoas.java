package desafioContadorDio;

public class Pessoas {

    private int numero;
    private String nome;
    private int n1;
    private int n2;

    public Pessoas(int numero, String nome, int n1, int n2) {
        this.numero = numero;
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void visualizar() {
        System.out.println("\n\n***********************************************************");
        System.out.println("Dados da Conta:");
        System.out.println("***********************************************************");
        System.out.println("Numero do Contador: " + this.numero);
        System.out.println("Nome: " + this.nome);
        System.out.println("Primeiro número: " + this.n1);
        System.out.println("Segundo número: " + this.n2);
    }

    @Override
    public String toString() {
        return "Pessoas [numero=" + numero + ", nome=" + nome + ", n1=" + n1 + ", n2=" + n2 + "]";
    }
}