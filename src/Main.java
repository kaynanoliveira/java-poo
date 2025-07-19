public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Kaynan");
        p1.setAltura(1.73f);
        p1.setDataNascimento("26/02/2006");
        p1.calcularIdade();
        p1.imprimirPessoa();
    }
}