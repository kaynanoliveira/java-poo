import java.time.LocalDate;
import java.time.Period;

public class Jogador {
    private String nome;
    private String posicao;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;

    public Jogador(String nome, String posicao, LocalDate dataNascimento, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    // calcula quanto tempo falta para o jogador se aposentar
    public void tempoAposentar() {
        int idade = Period.between(dataNascimento, LocalDate.now()).getYears();
        int idadeAposentadoria;

        if (this.posicao.equalsIgnoreCase("defesa")) {
            idadeAposentadoria = 40;
        } else if (this.posicao.equalsIgnoreCase("meio-campo")) {
            idadeAposentadoria = 38;
        } else if (this.posicao.equalsIgnoreCase("atacante")) {
            idadeAposentadoria = 35;
        } else {
            System.out.println("Posição inválida!!");
            return;
        }

        int tempoRestante = idadeAposentadoria - idade;

        if (tempoRestante > 0) {
            System.out.println("Faltam " + tempoRestante + " anos para se aposentar");
        } else {
            System.out.println("Já pode se aposentar");
        }
    }

    public void calcularIdade() {
        LocalDate dataAtual = LocalDate.now();  // pega a data atual
        Period idade = Period.between(dataNascimento, dataAtual);  // calcula a diferença entre nascimento e hoje
        System.out.println(nome + " tem " + idade.getYears() + " anos"); // mostra a idade
    }

    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Posição: " + getPosicao());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}