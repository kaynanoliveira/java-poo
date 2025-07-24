import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Kaynan", "atacante",
                LocalDate.of(2006, 02, 26),
                "Brasil", 1.73, 60.0);

        jogador.imprimirDados();
        jogador.calcularIdade();
        jogador.tempoAposentar();
    }
}