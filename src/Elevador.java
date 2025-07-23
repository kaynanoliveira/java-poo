public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadePessoas;
    private int quantidadePessoas;

    public Elevador(int totalAndares, int capacidadePessoas) {
        this.totalAndares = totalAndares;
        this.capacidadePessoas = capacidadePessoas;
        this.andarAtual = 0;
        this.quantidadePessoas = 0;
    }

    public void entrar() {
        if (quantidadePessoas < capacidadePessoas) {
            System.out.println("Entrando...");
            quantidadePessoas++;
        } else {
            System.out.println("Limite de pessoas atingido!!");
        }
        System.out.println("Andar atual: " + getAndarAtual());
        System.out.println("Pessoas no elevador: " + getQuantidadePessoas());
    }

    public void sair() {
        if (quantidadePessoas > 0) {
            System.out.println("Saindo...");
            quantidadePessoas--;
        } else {
            System.out.println("O elevador está vazio!!");
        }
        System.out.println("Andar atual: " + getAndarAtual());
        System.out.println("Pessoas no elevador: " + getQuantidadePessoas());
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            System.out.println("Subindo...");
            andarAtual++;
        } else {
            System.out.println("Não foi possivel subir, pois você está no ultimo andar!");
        }
        System.out.println("Andar atual: " + getAndarAtual());
        System.out.println("Pessoas no elevador: " + getQuantidadePessoas());
    }

    public void descer() {
        if (andarAtual > 0) {
            System.out.println("Descendo...");
            andarAtual--;
        } else {
            System.out.println("Não foi possivel descer, você está no terreo!");
        }
        System.out.println("Andar atual: " + getAndarAtual());
        System.out.println("Pessoas no elevador: " + getQuantidadePessoas());
    }

    public int getAndarAtual() {
        return andarAtual;
    }


    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }
}
