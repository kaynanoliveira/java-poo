public class ContaCorrente {
    private int numeroDaConta;
    private String nome;
    private double saldo;


    public ContaCorrente(int numeroDaConta, String nome, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void deposito(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void saque(double valor){
        if(valor > 0 && valor <= saldo){
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void alterarNome(String nome){
        this.nome = nome;
        System.out.println("Nome alterado para: " + this.nome);
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirSaldo(){
        System.out.println("Saldo total: " + saldo);
    }
}