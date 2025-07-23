public class Funcionarios {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Funcionarios(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (salarioMensal > 0.0) {
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 0.0;
        }
    }

    public void exibirDados() {
        System.out.println("Funcionário: " + nome + " " + sobrenome);
        System.out.printf("Salário anual: %.2f\n", getSalarioAnual());
    }

    public void aumentarSalario(){
        salarioMensal = salarioMensal * 1.10;
    }

    public double getSalarioAnual() {
        return salarioMensal * 12;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalario(double salarioMensal) {
        if (salarioMensal > 0.0) {
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 0.0;
        }
    }
}
