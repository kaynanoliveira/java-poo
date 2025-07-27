import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class Agenda {
    private Pessoa[] pessoas;  // Declara um array do tipo Pessoa
    private int quantidade;

    public Agenda() {
        pessoas = new Pessoa[10];  // array que guarda objetos do tipo Pessoa
        quantidade = 0;
    }

    public void armazenarPessoa(String nome, String dataNascimento, float altura) {
        if (quantidade < 10) {
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nome);
            pessoa.setDataNascimento(dataNascimento);
            pessoa.setAltura(altura);
            pessoas[quantidade] = pessoa;
            quantidade++;
        } else {
            System.out.println("Agenda cheia! Não é possível adicionar mais pessoas.");
        }
    }

    public void removerPessoa(String nome) {
        int index = buscarPessoa(nome);  // Procura a pessoa
        if (index != -1) {  // Verifica se a pessoa foi encontrada
            for (int i = index; i < quantidade - 1; i++) {
                pessoas[i] = pessoas[i + 1];
            }
            pessoas[quantidade - 1] = null;
            quantidade--;
            System.out.println(nome + " foi removido(a) da agenda.");
        } else {
            System.out.println("Pessoa não encontrada na agenda.");
        }

    }

    public int buscarPessoa(String nome) {
        for (int i = 0; i < quantidade; i++) {
            if (pessoas[i].getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }

    public void imprimirPessoa(int index) {
        if (index >= 0 && index < quantidade) {
            pessoas[index].imprimirPessoa();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void imprimirAgenda() {
        if(quantidade == 0){
            System.out.println("Agenda vazia!");
        } else {
            for(int i = 0; i < quantidade; i++){
                System.out.println("Pessoa na posição " + i + ":");
                pessoas[i].imprimirPessoa();
                System.out.println("--------------------");
            }
        }
    }
}