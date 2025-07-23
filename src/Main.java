public class Main {
    public static void main(String[] args) {
        Funcionarios funcionario1 = new Funcionarios("Kaynan", "Oliveira", 1500.0);
        Funcionarios funcionario2 = new Funcionarios("Lucas", "Duarte", 2500.0);

        funcionario1.exibirDados();
        funcionario1.aumentarSalario();
        funcionario1.exibirDados();
    }
}