public class Main {
    public static void main(String[] args) {
        // Criando uma conta com saldo inicial
        ContaCorrente conta1 = new ContaCorrente(12345, "Kaynan Oliveira", 1000.0);

        // Exibindo saldo inicial
        conta1.exibirSaldo();

        // Realizando um depósito
        conta1.deposito(500.0);

        // Exibindo saldo após depósito
        conta1.exibirSaldo();

        // Tentando sacar um valor válido
        conta1.saque(300.0);

        // Exibindo saldo após saque
        conta1.exibirSaldo();

        // Tentando sacar mais do que o saldo
        conta1.saque(2000.0); // Deve exibir mensagem de erro

        // Alterando o nome do correntista
        conta1.alterarNome("Kaynan A. Oliveira");

        // Exibindo nome atualizado
        System.out.println("Nome atualizado: " + conta1.getNome());
    }
}
